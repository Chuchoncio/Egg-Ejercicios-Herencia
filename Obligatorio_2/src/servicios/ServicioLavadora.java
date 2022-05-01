/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author JuanManuelPergola
 */
public class ServicioLavadora {
    
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora crearLavadora() {
        ServicioElectrodomestico servElec = new ServicioElectrodomestico();
        Electrodomestico electro = servElec.crearElectrodomestico();
    
        System.out.print("Ingrese nivel de carga de la lavadora: ");
        Double carga = leer.nextDouble();
        
        return new Lavadora(electro, carga);
    }    
}
