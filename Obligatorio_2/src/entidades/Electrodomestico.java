package entidades;

import java.util.ArrayList;
import java.util.HashMap;

public class Electrodomestico {
    
    private Double precio;
    private String color;
    private char consum_elec;
    private Double peso;
    private ArrayList<String> colorDisp;
    HashMap<Character, Double> preciosPorLetra;

    public Electrodomestico() {
        this.preciosPorLetra = new HashMap();   
    }

    public Electrodomestico(Double precio, String color, char consum_elec, Double peso) {
        this.preciosPorLetra = new HashMap();
        this.colorDisp = new ArrayList();
        this.precio = precio;
        this.peso = peso;
        
        llenarPreciosPorLetra();
        llenarColorDisp();
        comprobarColor(color);
        comprobarConsumoEnergetico(this.consum_elec);
    }
    
    private void llenarPreciosPorLetra() {
        preciosPorLetra.put('A', 1000.0);
        preciosPorLetra.put('B', 800.0);
        preciosPorLetra.put('C', 600.0);
        preciosPorLetra.put('D', 500.0);
        preciosPorLetra.put('E', 300.0);
        preciosPorLetra.put('F', 100.0);
    }
    
    private void llenarColorDisp() {
        colorDisp.add("blanco");
        colorDisp.add("negro");
        colorDisp.add("rojo");
        colorDisp.add("azul");
        colorDisp.add("gris");
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsum_elec() {
        return consum_elec;
    }

    public void setConsum_elec(char consum_elec) {
        this.consum_elec = consum_elec;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    private void comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if ( (letra >= 'A' && letra <= 'F') ) {
            this.setConsum_elec(letra);
        } else {
            this.setConsum_elec('F');
        }
    }
    
    private boolean verifColor(String color) {
        for(String col : colorDisp) {
            if(color.equals(col)) {
                return true;
            }
        }      
        return false;
    }
    
    private void comprobarColor(String color) {
        color = color.toLowerCase();
        if(!verifColor(color)) {
            this.setColor("blanco");
        } else {
            this.setColor(color);
        }
    }
    
    public void precioFinal() {
        precio = preciosPorLetra.get(this.getConsum_elec());
        
        if(peso >= 1 && peso <= 19)
            precio += 100.0;
        else if(peso >= 20 && peso <= 49)
            precio += 500.0;
        else if(peso >= 50 && peso <= 79)
            precio += 800.0;
        else if(peso >= 80)
            precio += 1000.0;
        else
            System.out.println("Peso inadecuado!");
    }
}
