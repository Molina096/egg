
package ejerpract1_g3;

import java.util.Scanner;

/**
 * @author molin
 */
public class EjerPract4_G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Escriba un programa que pida una frase o palabra y valide si la primera 
        //letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá 
        //de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”
        
        String primeraLetra;  
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una Frase");
        String frase1 = leer.nextLine();
        
        primeraLetra = frase1.substring(0,1);
        
         if (primeraLetra.equals("A")) {
             System.out.println("Correcto");
         } else {
             System.out.println("Incorrecto");
         }
        
        
    }
    
}
