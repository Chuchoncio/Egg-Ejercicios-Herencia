/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package obligatorio_2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Television;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioLavadora;
import servicios.ServicioTelevision;

/**
 *
 * @author JuanManuelPergola
 */
public class Obligatorio_2 {
    private static final Scanner LEER = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        ArrayList<Electrodomestico> listaElecs = new ArrayList();
        ServicioLavadora servLav = new ServicioLavadora();
        ServicioTelevision servTel = new ServicioTelevision();
        Double sumaTotal = 0.0;
        char opc;
        
        for(int i = 0; i < 4; i++) {
            System.out.println("1. Agregar Lavadora \n2. Agregar Televisor");  
            System.out.print("Opcion: ");
            opc = LEER.next().toLowerCase().charAt(0);
            
            switch(opc) {
                case '1':
                    System.out.println("Ingreso Datos Lavadora");
                    System.out.println("----------------------");
                    listaElecs.add(servLav.crearLavadora());
                    break;
                case '2':
                    System.out.println("Ingreso Datos Television");
                    System.out.println("------------------------");
                    listaElecs.add(servTel.crearTelevision());
                    break;
                default:
                    System.out.println("Opcion erronea!");
            }
        }
        
        for(Electrodomestico elec : listaElecs) {
           elec.precioFinal();
            System.out.println("El precio del " + elec.getClass() + " es: " + 
                               elec.getPrecio());
           sumaTotal += elec.getPrecio();
        }
        
        System.out.println("La suma total es de: " + sumaTotal);    
    }
    
}
