package entidades;


public class Television extends Electrodomestico {
    private Double resolucion;
    private Boolean sintonizadorTDT;

    public Television() {
    }

    // public Electrodomestico(Double precio, String color, char consum_elec, Double peso) {
    public Television(Electrodomestico elec, Double resolucion, Boolean sintonizadorTDT) {
        super(elec.getPrecio(), elec.getColor(), elec.getConsum_elec(), elec.getPeso());
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public Boolean getSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(Boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    @Override
    public void precioFinal() {
        super.precioFinal();
        
        if(this.resolucion > 40.0)
            this.setPrecio(this.getPrecio() * 1.30);
        
        if(this.sintonizadorTDT)
            this.setPrecio(this.getPrecio() + 500);
    }
}
