
package mascotasapp;

import java.util.Scanner;
import mascotasapp.entidades.Mascota;
import mascotasapp.servicios.servicioMascota;

/**
 *
 * @author molin
 */
public class MascotasApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        servicioMascota sm = new servicioMascota();
        
        Mascota m1 = sm.crearmascota();
        
                
        System.out.println(m1.toString());
                
                
    }
        
}
