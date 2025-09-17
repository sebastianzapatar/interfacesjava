package animales;

public class Perro extends Mamifero {
    private String nombre;

    public Perro(String color, int edad,
                 int tam, int peso, String nombre) {
        super(color, edad, tam, peso);
        this.nombre = nombre;
    }

    public Perro(){
        super();
    }
    public void saludar(){
        System.out.println("Perro say hi, mi ñero");
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void morir(){
        System.out.println("Wow chau, love u 😭");
    }
}
