/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import controllers.Login_controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fabri
 */
public class Login_models {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Login_controllers IniciarSesion (String nombreusuario, String clave) {
        Login_controllers login = new Login_controllers();
        String query = "SELECT u.*, nv.nombreacceso FROM usuario u "
                + "INNER JOIN nivelacceso nv ON nv.idnivelacceso = u.idnivelacceso "
                + "WHERE u.estado = 1 AND u.nombreusuario = ? AND u.clave = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombreusuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                login.setIdusuario(rs.getInt("idusuario"));
                login.setDocumento(rs.getString("documento"));
                login.setNombres(rs.getString("nombres"));
                login.setApellidos(rs.getString("apellidos"));
                login.setNombreusuario(rs.getString("nombreusuario"));
                login.setClave(rs.getString("clave"));
                login.setIdnivelacceso(rs.getInt("idnivelacceso"));  // Ahora lo tomas del ResultSet
                login.setEstado(rs.getBoolean("estado"));  // Si es tipo boolean
            }
        }
        catch (SQLException e) {
            System.err.println("Error al iniciar sesión: " + e.toString());
        }
        return login;
    }
    
}
