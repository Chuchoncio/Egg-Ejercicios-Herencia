
package obligatorio_1.entidades;

public class Caballo extends Animal{
    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println(this.getNombre() + " se alimenta con " + this.getAlimento());
    }
}
