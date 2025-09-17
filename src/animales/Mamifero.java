package animales;

public  abstract class Mamifero {
    private String color;
    private int edad;
    private int tam;
    private int peso;

    public Mamifero(String color, int edad, int tam, int peso) {
        this.color = color;
        this.edad = edad;
        this.tam = tam;
        this.peso = peso;
    }

    public Mamifero() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    public abstract void morir();
}
