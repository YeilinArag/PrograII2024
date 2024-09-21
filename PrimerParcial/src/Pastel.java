class Pastel extends Postre {
    private String sabor;

    public Pastel(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura, String sabor) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
        this.sabor = sabor;
    }
}