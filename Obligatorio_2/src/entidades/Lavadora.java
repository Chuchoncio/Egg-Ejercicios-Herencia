/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author JuanManuelPergola
 */
public class Lavadora extends Electrodomestico {

    private Double carga;
    
    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char consum_elec, Double peso) {
        super(precio, color, consum_elec, peso);
        this.carga = carga;
    }
    
    public Lavadora(Electrodomestico elec, Double carga) {
        super(elec.getPrecio(), elec.getColor(), elec.getConsum_elec(), elec.getPeso());
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(this.getPeso() > 30) {
            this.setPrecio(this.getPrecio() + 500.0);
        }
    }
}
