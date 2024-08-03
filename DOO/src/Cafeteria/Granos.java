package Cafeteria;

public class Granos implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Granos(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Granos de café " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
