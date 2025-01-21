package Actividad1;

public class Vehiculo {
    protected String nombre;
    protected int velocidad;

    public Vehiculo(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void mover() {

        if (velocidad == 0) {

            System.out.println("El coche está parado");

        } else {

            System.out.println("El coche está en movimiento");

        }
    }

}
