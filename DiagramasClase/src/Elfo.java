public class Elfo extends Personaje implements Heroe {
    public void atacar() {
        System.out.println("Elfo ataca con arco y flecha");
    }

    public void defender() {
        System.out.println("Elfo se defiende con agilidad");
    }

    public void recibirAtaque() {
        System.out.println("Elfo recibe ataque");
    }
}