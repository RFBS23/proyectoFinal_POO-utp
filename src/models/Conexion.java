/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author fabri
 */
public class Conexion {
    Connection conexion;
    
    public Connection getConnection() {
        try {
            String DataBase = "jdbc:mysql://localhost:3307/proyectopoofinal?serverTimezone=UTC";
            conexion = DriverManager.getConnection(DataBase, "root", "fabrizio");
            return conexion;
        }
        catch(Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }    
}
