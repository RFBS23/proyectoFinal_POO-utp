/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controllers;

import java.time.LocalDateTime;

/**
 *
 * @author fabri
 */

public class Login_controllers {
    private int idusuario;
    private String documento;
    private String nombres;
    private String apellidos;
    private String nombreusuario;
    private String clave;
    private int idnivelacceso;
    private boolean estado;
    private LocalDateTime fecharegistro;
    
    public Login_controllers() {
    }
    
    public Login_controllers(int idusuario, String documento, String nombres, String apellidos, String nombreusuario, String clave, int idnivelacceso, boolean estado) {
        this.idusuario = idusuario;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nombreusuario = nombreusuario;
        this.clave = clave;
        this.idnivelacceso = idnivelacceso;
        this.estado = estado;
        this.fecharegistro = LocalDateTime.now();
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getIdnivelacceso() {
        return idnivelacceso;
    }

    public void setIdnivelacceso(int idnivelacceso) {
        this.idnivelacceso = idnivelacceso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
    
}
