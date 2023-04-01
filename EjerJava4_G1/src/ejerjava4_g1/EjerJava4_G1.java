/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerjava4_g1;

import java.util.Scanner;

public class EjerJava4_G1 {

    /**
   Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
   * La fórmula correspondiente es: F = 32 + (9 * C / 5).

     */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double C,F;
        System.out.println("Ingrese la cantidad de grados Celcios que desea mostrar en Fahrenheit");
        C = lector.nextDouble();
        F =  32 + (9 * C / 5.0);
        System.out.println(C + " Grados celcius equivalen a " + F + " Grados Fahrenheit");
                    
        
        
        
                
    }
    
}
