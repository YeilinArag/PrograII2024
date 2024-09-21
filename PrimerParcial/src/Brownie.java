class Brownie extends Postre {
    private String tipoChocolate;

    public Brownie(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura, String tipoChocolate) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
        this.tipoChocolate = tipoChocolate;
    }
}
