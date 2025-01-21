package Actividad1;

public class Gasolina extends Coche{

    protected int marchas;

    public Gasolina(String nombre, int velocidad, int ruedas, int marchas) {
        super(nombre, velocidad, ruedas);
        this.marchas = marchas;
    }

    public void marcharCoche(){

        if (marchas <1 | marchas>6){

            System.out.println("Error, número de marchas introducido erroneo");

        }

    }
}
