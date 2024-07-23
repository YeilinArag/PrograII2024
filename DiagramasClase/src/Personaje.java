public abstract class Personaje {
    protected String nombre;
    protected String descripcion;
    protected long tamaño;
    protected int poder;
    protected int vida;

    public void desplazarse() {
        System.out.println(nombre + " se está desplazando.");
    }

    public int mostrarVida() {
        return vida;
    }

    public void mostrarPoder() {
        System.out.println(nombre + " tiene un poder de " + poder);
    }
}
