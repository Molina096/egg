
package ejerpract1_g3;
//@author molin

import java.util.Scanner;

public class EjerPract2_G3 {
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /**
     * Crear un programa que pida una frase y si esa frase es igual a “eureka”
     * el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
     */
        Scanner leer = new Scanner(System.in);
        
        String Frase;
        String palabraClave;
        
        System.out.println("Ingrese una frase");
        Frase = leer.nextLine();
        palabraClave = "eureka";
         
        if (Frase.equals(palabraClave)){
            System.out.println("Correcto");
        }else {
            System.out.println("Incorrecto");
        }
        
}
    }
