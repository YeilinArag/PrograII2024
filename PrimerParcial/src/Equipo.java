class Equipo {
    private String tipo;
    private boolean estado;

    public Equipo(String tipo) {
        this.tipo = tipo;
        this.estado = false;
    }

    public void encender() {
        estado = true;
        System.out.println(tipo + " encendido");
    }

    public void apagar() {
        estado = false;
        System.out.println(tipo + " apagado");
    }

    public void reparar() {
        System.out.println("Reparando " + tipo);
    }
}