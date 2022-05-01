
package servicios;

import entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Rectangulo crearRectangulo() {
        System.out.println("INGRESO DE DATOS DEL RECTANGULO");
        System.out.print("Ingrese base: ");
        Double bas = leer.nextDouble();
        
        System.out.print("Ingrese altura: ");
        Double alt = leer.nextDouble();
        
        return new Rectangulo(bas, alt);   
    }
    
}
