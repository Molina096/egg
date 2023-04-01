
package introjava;


import java.util.Scanner;


public class ManoEjer_6 {
    
    public static void main(String[] args) {
//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.

    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa dos numeros");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    if (num1 > num2){
        System.out.println("el "+num1+" es mayor que "+num2);
    }else 
        System.out.println("el "+num2+" es mayor que "+num1); 
        
    }
    
}

    

