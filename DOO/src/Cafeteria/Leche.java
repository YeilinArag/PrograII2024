package Cafeteria;

public class Leche implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Leche(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return "Leche " + tipo;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}
