class Crepa extends Postre {
    private String tipoMasa;

    public Crepa(String nombre, String tamaño, double precio, Masa masa, Relleno relleno, Cobertura cobertura, String tipoMasa) {
        super(nombre, tamaño, precio, masa, relleno, cobertura);
        this.tipoMasa = tipoMasa;
    }
}
