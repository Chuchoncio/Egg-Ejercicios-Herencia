/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Television;
import java.util.Scanner;

/**
 *
 * @author JuanManuelPergola
 */
public class ServicioTelevision {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Television crearTelevision() {
        ServicioElectrodomestico servElec = new ServicioElectrodomestico();
        Electrodomestico electro = servElec.crearElectrodomestico();
    
        System.out.print("Ingrese la resolucion del televisor (pulgadas): ");
        Double pulg = leer.nextDouble();
        
        System.out.print("Ingrese si posee o no sintonizador TDT: ");
        String sintoIng = leer.next().toLowerCase();
        
        Boolean sinto = false;
        if(sintoIng.equals("si"))
            sinto = true;
        
        return new Television(electro, pulg, sinto);
    }
}
