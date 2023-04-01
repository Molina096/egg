/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerjava1_g1;

import java.util.Scanner;

/**
 *
 * @author molin
 */
public class EjerJava1_G1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println(" Ingrese dos Numeros " );
        int numeroEntero1 = leer.nextInt();
        int numeroEntero2 = leer.nextInt();
        
        int varAuxiliar = numeroEntero1 + numeroEntero2;
        System.out.println(" esta es la suma de dos numeros enteros " + varAuxiliar );
    
    }
    
}
