package ZOO;

import animales.Animal;
import animales.Delfin;
import animales.Loro;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    List<Animal> animals = new ArrayList<Animal>();
    public void agregarAnimal(Animal animal) {
        animals.add(animal);
    }
    public void mostrarSonidos(){
        for(Animal animal : animals){
            animal.hacerSonido();
        }
        /*for(int i=0; i<animals.size(); i++){
            animals.get(i).hacerSonido();
        }*/
    }
    public void mostrarHabilidad(){
        for(Animal animal : animals){

            if(animal instanceof Delfin){
                System.out.println("Nado como un putas");
            }
            else if(animal instanceof Loro){
                System.out.println("Cantar la cucaracha");
            }
        }
    }
}
