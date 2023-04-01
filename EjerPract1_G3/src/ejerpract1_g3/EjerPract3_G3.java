package ejerpract1_g3;
/**
 *
 * @author molin
 */
import java.util.Scanner;

public class EjerPract3_G3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
        //Si el usuario ingresa una frase o palabra de 8 de largo se deberá de 
        //imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase1 = leer.nextLine();
        
        System.out.println("La frase contiene " + frase1.length()+ " caracteres");
        if (frase1.length()<=8){
            System.out.println("Correcta");
        } else{
            System.out.println("Incorrecto");
        }  
    }
    
}
