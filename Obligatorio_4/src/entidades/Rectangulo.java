
package entidades;

public class Rectangulo implements Forma {
    
    protected Double area;
    protected Double perimetro;
    protected Double base;
    protected Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getArea() {
        return area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }    
    
    @Override
    public void calcularArea() {
        area = this.getBase() * this.getAltura();
    }
    
    @Override
    public void calcularPerimetro() {
        perimetro = (this.getBase() + this.getAltura()) * 2;
    }
    
    @Override
    public Double getPI() {
        return PI;
    } 
}
