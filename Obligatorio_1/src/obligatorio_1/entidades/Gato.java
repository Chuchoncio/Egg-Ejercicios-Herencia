
package obligatorio_1.entidades;

/*
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
*/
public class Gato extends Animal {
    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println(this.getNombre() + " se alimenta con " + this.getAlimento());
    }
}
