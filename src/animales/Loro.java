package animales;

public class Loro extends Animal implements IVolador{
    public Loro() {
        super();
    }
    public Loro(String nombre, int velocidad) {
        super(nombre, velocidad);
    }
    @Override
    public void hacerSonido(){
        System.out.println("Cantar la cucaracha");
    }
    @Override
    public void volar(){
        System.out.println("Mamá estoy triufando");
    }
}
