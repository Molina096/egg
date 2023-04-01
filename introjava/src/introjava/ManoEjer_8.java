
package introjava;

import java.util.Scanner;

public class ManoEjer_8 {
     public static void main(String[] args) {
    //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 
    //la nota se pedirá de nuevo hasta que la nota sea correcta.
        
    Scanner leer = new Scanner(System.in);
   
    System.out.println("Ingresa una nota");
    int nota = leer.nextInt();
    while ( nota < 0 || nota > 10 );  
    {
    
    System.out.println(+nota+" La nota es Incorrecta");
    nota = leer.nextInt();}
 
  {System.out.println(+nota+" La nota esta dentro del rango ");
               }
   } 
}
     

 