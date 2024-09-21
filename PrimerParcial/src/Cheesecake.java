class Cheesecake extends Postre {
    private String tipoQueso;

    public Cheesecake(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura, String tipoQueso) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
        this.tipoQueso = tipoQueso;
    }
}
