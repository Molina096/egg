/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotasapp.entidades;

/**
 *
 * @author molin
 */
public class Mascota {
    
    private String nombre;
    private String  apodo;
    private String tipo; 
    private String color; 
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    private String angel;   
        
    
    public Mascota(){
        this.energia = 1000;
        } 

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        
        if(tipo.equals("Perro") || tipo.equals("Gato") ||  tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) 
           this.tipo = tipo;     
         
        this.energia = 1000;      
        }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }
 
    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    public int pasear(int energiaRestar){
        
        energia = energia - energiaRestar;
        return energia;
    }

     public int pasear(int energiaRestar, int vueltas){
        
         for (int i = 0; i < vueltas; i++) {
              energia = energia - energiaRestar;
       
         }
          return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
     
     
    

    
}
