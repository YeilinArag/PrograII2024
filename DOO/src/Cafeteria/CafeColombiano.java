package Cafeteria;

public class CafeColombiano extends Cafe {
    private String tipoGrano;

    public CafeColombiano(String nombre, String tamaño, double precio, Granos granos, Agua agua, Leche leche, String tipoGrano) {
        super(nombre, tamaño, precio, granos, agua, leche);
        this.tipoGrano = tipoGrano;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando café colombiano con granos " + tipoGrano);
    }
}
