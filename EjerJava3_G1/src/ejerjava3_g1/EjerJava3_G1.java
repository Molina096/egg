/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerjava3_g1;

import java.util.Scanner;

/**
 *
 * @author molin
 */
public class EjerJava3_G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        //Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        Scanner read = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = read.nextLine();
        String fraseM = frase.toUpperCase();
        String fraseMi = frase.toLowerCase();
        
        System.out.println(fraseM);
        System.out.println(fraseMi);
        
        
    }
    
}