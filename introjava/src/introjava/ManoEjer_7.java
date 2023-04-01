

package introjava;

import java.util.Scanner;

public class ManoEjer_7 {
     public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int tipoMotor = leer.nextInt();

        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }

    }

}