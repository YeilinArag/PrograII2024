abstract class Postre {
    protected String nombre;
    protected String tamaño;
    protected double precio;
    protected Masa masa;
    protected Relleno relleno;
    protected Cobertura cobertura;

    public Postre(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.masa = masa;
        this.relleno = relleno;
        this.cobertura = cobertura;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
    }

    public void servir() {
        System.out.println("Sirviendo " + nombre);
    }
}
