
package obligatorio_1;

import obligatorio_1.entidades.Animal;
import obligatorio_1.entidades.Gato;
import obligatorio_1.entidades.Perro;
import obligatorio_1.entidades.Caballo;

public class Obligatorio_1 {

    public static void main(String[] args) {
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.Alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuaha");
        perro1.Alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.Alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.Alimentarse();
    }

}
