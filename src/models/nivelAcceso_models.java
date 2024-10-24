/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import controllers.NivelAcceso_controllers;
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
public class nivelAcceso_models {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public NivelAcceso_controllers nivelacceso (String nombreacceso) {
        NivelAcceso_controllers nivelacceso = new NivelAcceso_controllers();
        String query = "select idnivelacceso, nombreacceso from nivelacceso";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombreacceso);
            rs = ps.executeQuery();
            if (rs.next()) {
                nivelacceso.setIdnivelacceso(rs.getInt("idnivelacceso"));
                nivelacceso.setNombreacceso(rs.getString("nombreacceso"));
            }
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
        return nivelacceso;
    }
}
