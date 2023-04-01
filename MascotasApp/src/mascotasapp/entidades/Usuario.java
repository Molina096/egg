/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotasapp.entidades;

import java.util.Date;

/**
 *
 * @author molin
 */
public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public Date nacimiento;
    public String nacionalidad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.nacionalidad = nacionalidad;
    }
    
    
    
    

}
