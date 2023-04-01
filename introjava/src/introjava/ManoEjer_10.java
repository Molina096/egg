
package introjava;

import java.util.Scanner;

public class ManoEjer_10 {

    public static void main(String[] args) {
        /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
        *e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
        */
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese 4 numeros");
        int n1 =leer.nextInt();
        int n2 =leer.nextInt();
        int n3 =leer.nextInt();
        int n4 =leer.nextInt();
       
        
        if (n1<20){
            System.out.print(n1);
            for(int i = 0; i < n1 ; i++){
                System.out.print("*");
            } 
              } else {
            System.out.println("Numero indicado no es correcto");
            
            
        }System.out.println(" ");
        if (n2<20){
            System.out.print(n2);
            for(int i = 0; i < n2 ; i++){
                System.out.print("*");
            } 
              } else {
            System.out.println("Numero indicado no es correcto");
            
            
        }System.out.println(" ");
        if (n3<20){
            System.out.print(n3);
            for(int i = 0; i < n3 ; i++){
                System.out.print("*");
            } 
              } else {
            System.out.print("Numero indicado no es correcto");
            
            
        }System.out.println(" ");
        if (n4<20){
            System.out.print(n4);
            for(int i = 0; i < n4 ; i++){
                System.out.print("*");
            } 
              } else {
            System.out.println("Numero indicado no es correcto");
        } 
       System.out.println(" ");
  }  
 
}
                               