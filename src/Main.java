import animales.Gato;
import animales.Mamifero;
import animales.Perro;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        perro.setNombre("Perro");
        perro.setEdad(14);
        perro.setColor("Verde");
        perro.setNombre("Chandrix");
        Gato gato = new Gato();
        Mamifero mw[]=new Mamifero[2];
        mw[0]=perro;
        mw[1]=gato;
        Mamifero perrito=new Perro();
        for(Mamifero m:mw){
            m.morir();

        }

    }
}