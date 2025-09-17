package animales;

public class Gato extends Mamifero {
    private String nombre;
    public Gato() {
        super();
        this.nombre = "Gatico malparido";
    }

    public Gato(String color, int edad, int tam, int peso, String nombre) {
        super(color, edad, tam, peso);
        this.nombre = nombre;
    }

    @Override
    public void morir(){
        System.out.println("Me paga mi arriendo por vivir" +
                "conmigo");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
