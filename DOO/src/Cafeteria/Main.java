package Cafeteria;

public class Main {
    public static void main(String[] args) {

        Granos granosColombiano = new Granos("Colombiano", 1000);
        Granos granosItaliano = new Granos("Italiano", 1000);
        Agua agua = new Agua(5000);
        Leche lecheEntera = new Leche("Entera", 2000);
        OtrosIngredientes azucar = new OtrosIngredientes("Azúcar", 500);


        CafeColombiano cafeColombiano = new CafeColombiano("Café Colombiano", "Grande", 3.5, granosColombiano, agua, lecheEntera, "Supremo");
        EspressoItaliano espressoItaliano = new EspressoItaliano("Espresso Italiano", "Pequeño", 2.5, granosItaliano, agua, null, 5);


        Sucursal sucursalBogota = new Sucursal("Café Bogotá", "Calle 123, Bogotá");
        Sucursal sucursalRoma = new Sucursal("Caffè Roma", "Via Roma 456, Roma");


        sucursalBogota.agregarEspecialidad(cafeColombiano);
        sucursalRoma.agregarEspecialidad(espressoItaliano);


        Empleado empleado1 = new Empleado("Juan", "Barista", 2000);
        Empleado empleado2 = new Empleado("Maria", "Cajera", 1800);
        sucursalBogota.agregarEmpleado(empleado1);
        sucursalBogota.agregarEmpleado(empleado2);


        sucursalBogota.agregarIngrediente(granosColombiano);
        sucursalBogota.agregarIngrediente(agua);
        sucursalBogota.agregarIngrediente(lecheEntera);
        sucursalBogota.agregarIngrediente(azucar);


        Equipo maquinaCafe = new Equipo("Máquina de café");
        sucursalBogota.agregarEquipo(maquinaCafe);


        System.out.println("Demostración de la sucursal Bogotá:");
        empleado1.trabajar();
        empleado2.tomarOrden();
        maquinaCafe.encender();
        cafeColombiano.preparar();
        cafeColombiano.servir();
        maquinaCafe.apagar();

        System.out.println("\nDemostración de la sucursal Roma:");
        espressoItaliano.preparar();
        espressoItaliano.servir();
    }
}