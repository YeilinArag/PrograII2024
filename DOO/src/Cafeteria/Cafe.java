package Cafeteria;

public abstract class Cafe {
    protected String nombre;
    protected String tamaño;
    protected double precio;
    protected Granos granos;
    protected Agua agua;
    protected Leche leche;

    public Cafe(String nombre, String tamaño, double precio, Granos granos, Agua agua, Leche leche) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.granos = granos;
        this.agua = agua;
        this.leche = leche;
    }

    public abstract void preparar();

    public void servir() {
        System.out.println("Sirviendo " + nombre + " en tamaño " + tamaño);
    }
}
