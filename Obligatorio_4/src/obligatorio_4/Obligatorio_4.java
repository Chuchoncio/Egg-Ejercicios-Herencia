
package obligatorio_4;

import entidades.Circulo;
import entidades.Rectangulo;
import servicios.ServicioCirculo;
import servicios.ServicioRectangulo;

public class Obligatorio_4 {

    public static void main(String[] args) {
        ServicioCirculo servCirc = new ServicioCirculo();
        ServicioRectangulo servRect = new ServicioRectangulo();
        
        Circulo circ = servCirc.crearCirculo();
        Rectangulo rect = servRect.crearRectangulo();
        
        circ.calcularArea();
        circ.calcularPerimetro();
        
        rect.calcularArea();
        rect.calcularPerimetro();
        
        System.out.println("DATOS CIRCULO");
        System.out.println("-AREA: " + circ.getArea());
        System.out.println("-PERIMETRO: " + circ.getPerimetro());
        
        System.out.println("DATOS RECTANGULO");
        System.out.println("-AREA: " + rect.getArea());
        System.out.println("-PERIMETRO: " + rect.getPerimetro());
    }

}
