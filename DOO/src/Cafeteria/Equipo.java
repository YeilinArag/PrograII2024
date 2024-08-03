package Cafeteria;

public class Equipo {
    private String tipo;
    private String estado;


    public Equipo(String tipo) {
        this.tipo = tipo;
        this.estado = "apagado";
    }


    public void encender() {
        estado = "encendido";
        System.out.println(tipo + " encendido");
    }


    public void apagar() {
        estado = "apagado";
        System.out.println(tipo + " apagado");
    }


    public void reparar() {
        System.out.println("Reparando " + tipo);
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}