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
public class NivelAcceso_controllers {
    private int idnivelacceso;
    private String nombreacceso;
    private LocalDateTime fecharegistro;
    
    public NivelAcceso_controllers() {
    }
    
    public NivelAcceso_controllers(int idnivelacceso, String nombreacceso) {
        this.idnivelacceso = idnivelacceso;
        this.nombreacceso = nombreacceso;
        this.fecharegistro = LocalDateTime.now();
    }

    public int getIdnivelacceso() {
        return idnivelacceso;
    }

    public void setIdnivelacceso(int idnivelacceso) {
        this.idnivelacceso = idnivelacceso;
    }

    public String getNombreacceso() {
        return nombreacceso;
    }

    public void setNombreacceso(String nombreacceso) {
        this.nombreacceso = nombreacceso;
    }

    public LocalDateTime getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(LocalDateTime fecharegistro) {
        this.fecharegistro = fecharegistro;
    }
}
