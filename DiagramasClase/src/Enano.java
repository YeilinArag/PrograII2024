public class Enano extends Personaje implements Heroe {
    public void atacar() {
        System.out.println("Enano ataca con hacha");
    }

    public void defender() {
        System.out.println("Enano se defiende con escudo");
    }

    public void recibirAtaque() {
        System.out.println("Enano recibe ataque");
    }
}
