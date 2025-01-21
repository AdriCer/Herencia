package Actividad1;

public class Electrico extends Coche{
    protected int autonomia;

    public Electrico(String nombre, int velocidad, int ruedas, int autonomia) {
        super(nombre, velocidad, ruedas);
        this.autonomia = autonomia;
    }
}
