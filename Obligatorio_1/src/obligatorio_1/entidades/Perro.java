
package obligatorio_1.entidades;
/*
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
*/
public class Perro extends Animal {
    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
    @Override
    public void Alimentarse() {
        System.out.println(this.getNombre() + " se alimenta con " + this.getAlimento());
    }
}
