/*
 * Crear una clase llamada Libro que contenga los siguientes atributos: 
 *ISBN, Título, Autor, Número de páginas, y un constructor con todos 
 *los atributos pasados por parámetro y un constructor vacío. Crear un método 
 *para cargar un libro pidiendo los datos al usuario y luego informar mediante 
 *otro método el número de ISBN, el título, el autor del libro y el número de páginas.
 */
package libropooejerc1;

import java.util.Scanner;
import libropooejerc1.Entidades.Libro;

/**
 *
 * @author molin
 */
public class LibroPooEjerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Libro l1 = new Libro();
        
        System.out.println("Ingrese los datos solicitados");
        
        System.out.println("ISBN");
        l1.ISBN = leer.next();
        
        System.out.println("Autor");
        l1.Autor = leer.next();
        
        System.out.println("Titulo");
        l1.Título = leer.next();
        
        System.out.println("Paginas");
        l1.páginas = leer.nextInt();
        
        
        System.out.println(l1.toString());
                
}

}
