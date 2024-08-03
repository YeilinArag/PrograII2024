package Cafeteria;

public class Agua implements Ingrediente {
    private double cantidad;

    public Agua(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Agua";
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
