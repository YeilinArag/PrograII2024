public class Humano extends Personaje implements Heroe {
    public void atacar() {
        System.out.println("Humano ataca con espada");
    }

    public void defender() {
        System.out.println("Humano se defiende con armadura");
    }

    public void recibirAtaque() {
        System.out.println("Humano recibe ataque");
    }
}