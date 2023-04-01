
package introjava;

import java.util.Scanner;

public class ManoEjer_9 {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
    //la nota se pedirá de nuevo hasta que la nota sea correcta.
        
    Scanner leer = new Scanner(System.in);
    
   int num, n, suma;
   
   n = 0;
   suma = 0;
   
   do {
       System.out.println("Ingrese un numero");
       num = leer.nextInt();
        if (num > 0) 
          
        { suma = num + suma; 
        }
        n++;
        } 
        while ( num!=0 && n<20);
             
       System.out.println(" Se capturo el numero 0");
       System.out.println(" La suma total es "+suma);

         }    
  }
     

    

