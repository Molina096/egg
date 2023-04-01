/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerpract1_g3;

import java.util.Scanner;

/**
 *
 * @author molin
 */
public class EjerPract5_G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa en el cual se ingrese un valor límite positivo, y a continuacion 
        //solicite numeros al usuario hasta que la suma de los números introducidos supere el limite inicial.
        
        
        Scanner leer = new Scanner(System.in);
        
        int j,limite,suma,num;
        
        
        do {
            System.out.println("Ingresa un numero limite");
            num = leer.nextInt();
            if (num > 1000){
                        System.out.println("Este progama podria tardar (s/n)");
                        String confirma = leer.next();
                        if (confirma.equals("s")){
                             break;
             }
            }
        } while ( num <= 1000 || num > 1000 );
        
        for (int i = 0; i <= num; i++) {
            if(i%2 !=0)
            continue;
            
            suma = 0;
            j = 1;
            while (j<=i){
                suma += j;
                j++;
            }
            System.out.println("la suma de los numeros "+ i +" numeros naturales es " + suma);         
            
        }
        
    }
    
}
