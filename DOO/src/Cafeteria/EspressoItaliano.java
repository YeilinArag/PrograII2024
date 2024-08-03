package Cafeteria;

public class EspressoItaliano extends Cafe {
    private int intensidad;

    public EspressoItaliano(String nombre, String tamaño, double precio, Granos granos, Agua agua, Leche leche, int intensidad) {
        super(nombre, tamaño, precio, granos, agua, leche);
        this.intensidad = intensidad;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando espresso italiano con intensidad " + intensidad);
    }
}
