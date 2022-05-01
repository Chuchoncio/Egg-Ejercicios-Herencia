
package servicios;

import entidades.Circulo;
import java.util.Scanner;

public class ServicioCirculo {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo crearCirculo() {
        System.out.println("INGRESO DE DATOS DEL CIRCULO");
        System.out.print("Ingrese diametro: ");
        Double diam = leer.nextDouble();
        
        System.out.print("Ingrese radio: ");
        Double rad = leer.nextDouble();
        
        return new Circulo(rad, diam);   
    }
}
