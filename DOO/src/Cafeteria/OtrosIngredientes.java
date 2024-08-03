package Cafeteria;

public class OtrosIngredientes implements Ingrediente {
    private String nombre;
    private double cantidad;

    public OtrosIngredientes(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double obtenerCantidad() {
        return cantidad;
    }
}