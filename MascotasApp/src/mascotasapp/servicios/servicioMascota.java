/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotasapp.servicios;

import java.util.Scanner;
import mascotasapp.entidades.Mascota;

/**
 *
 * @author molin
 */
public class servicioMascota {
    
     private Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    
    public Mascota crearmascota(){
        
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
 
        return new Mascota(nombre, apodo, tipo);
     
    }
    
}
