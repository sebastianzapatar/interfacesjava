package animales;

public class Delfin extends Animal implements IAcuatico{
    public Delfin() {
        super();
    }
    public Delfin(String nombre, int edad) {
        super(nombre,edad);
    }
    @Override
    public void hacerSonido() {
        System.out.println("iiiii ಠ_ಠ");
    }

    @Override
    public void nadar() {
        System.out.println("Nado una chimba papu");
    }
}
