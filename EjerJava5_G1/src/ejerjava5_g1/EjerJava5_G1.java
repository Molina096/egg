
package ejerjava5_g1;

import java.util.Scanner;

public class EjerJava5_G1 {
    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble,
     * el triple y la raíz cuadrada de ese número. 
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println(" Ingrese un numero ");
        int a = leer.nextInt();
        int b = a * 2; 
        int c = a * 3;
        double raiz = Math.sqrt(a);
        
        System.out.println("El Doble de "+ a +" es "+ b);
        System.out.println("El Triple de "+ a + " es "+ c);
        System.out.println("La raiz cuadrada de " + a + " es "+ raiz);
    }
    
}
