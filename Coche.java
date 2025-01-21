package Actividad1;

public class Coche extends Vehiculo{
    protected int ruedas;

    public Coche(String nombre, int velocidad, int ruedas) {
        super(nombre, velocidad);
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }
}
