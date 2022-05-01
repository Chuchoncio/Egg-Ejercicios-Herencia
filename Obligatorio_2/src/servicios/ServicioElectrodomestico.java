/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author JuanManuelPergola
 */
public class ServicioElectrodomestico {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*
    private Double precio;
    private String color;
    private char consum_elec;
    private Double peso;
    */
    public Electrodomestico crearElectrodomestico() {
        Double prec = 1000.0;
        
        System.out.print("Ingrese color del electrodomestico: ");
        String col = leer.next();
        
        System.out.print("Ingrese letra del consumo electrico: ");
        char consum = leer.next().charAt(0);
        
        System.out.print("Ingrese peso del electrodomestico: ");
        Double pes = leer.nextDouble();

        return new Electrodomestico(prec, col, consum, pes);
    }
}
