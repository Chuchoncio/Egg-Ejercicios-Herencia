
package entidades;

public class Circulo implements Forma {
    
    protected Double area;
    protected Double perimetro;
    protected Double radio;
    protected Double diametro;

    public Circulo(Double radio, Double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    @Override
    public Double getPI() {
        return PI;
    }
    
    @Override
    public void calcularArea() {
        area = this.getPI() * (Math.pow(this.getRadio(),2));
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = this.getPI() * this.getDiametro();
    }
    
}
