
package ejerpract1_g3;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author molin
 */
public class EjerPract1_G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un programa que dado un número determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
        if (num % 2 == 0){ 
             System.out.println(+ num + " Es par");
         } else{
             System.out.println(+ num + " Es impar");
        }
             
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
