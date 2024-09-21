class Cobertura implements Ingrediente {
    private String tipo;
    private double cantidad;

    public Cobertura(String tipo, double cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String obtenerNombre() { return "Cobertura de " + tipo; }
    public double obtenerCantidad() { return cantidad; }
}