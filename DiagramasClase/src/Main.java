public class Main {
    public static void main(String[] args) {

        Elfo legolas = new Elfo();
        legolas.nombre = "Legolas";
        legolas.poder = 95;
        legolas.vida = 100;

        Enano gimli = new Enano();
        gimli.nombre = "Gimli";
        gimli.poder = 90;
        gimli.vida = 120;

        Ogro shrek = new Ogro();
        shrek.nombre = "Shrek";
        shrek.poder = 85;
        shrek.vida = 150;


        System.out.println("Demostrando comportamientos de los personajes:");


        legolas.desplazarse();
        gimli.mostrarPoder();
        System.out.println("Vida de " + shrek.nombre + ": " + shrek.mostrarVida());


        System.out.println("\nComportamientos de Héroes:");
        legolas.atacar();
        gimli.defender();
        legolas.recibirAtaque();


        System.out.println("\nComportamientos de Villanos:");
        shrek.atacar();
        shrek.destruir();


        System.out.println("\nDemostrando polimorfismo:");
        Personaje[] personajes = {legolas, gimli, shrek};
        for (Personaje p : personajes) {
            p.desplazarse();
            if (p instanceof Heroe) {
                ((Heroe) p).atacar();
            } else if (p instanceof Villano) {
                ((Villano) p).destruir();
            }
        }
    }
}