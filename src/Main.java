import ZOO.Zoologico;
import animales.*;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Animal animal = new Delfin("Winter",10);
        zoo.agregarAnimal(animal);
        Animal animal2 = new Loro("Sebastian",36);
        zoo.agregarAnimal(animal2);
        zoo.mostrarSonidos();
        zoo.mostrarHabilidad();

    }
}