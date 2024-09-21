public class Main {
    public static void main(String[] args) {
        try {

            Sucursal sucursalParis = new Sucursal("Sucursal París", "123 Rue de la Pâtisserie, París");


            Empleado empleado1 = new Empleado("Jean Dupont", "Chef Pastelero", 3000.0);
            Empleado empleado2 = new Empleado("Marie Leclerc", "Camarera", 2000.0);
            sucursalParis.agregarEmpleado(empleado1);
            sucursalParis.agregarEmpleado(empleado2);

            Masa masaCrepa = new Masa("Crepa", 5.0);
            Relleno rellenoChocolate = new Relleno("Chocolate", 2.0);
            Cobertura coberturaFresa = new Cobertura("Fresa", 1.0);
            sucursalParis.agregarIngrediente(masaCrepa);
            sucursalParis.agregarIngrediente(rellenoChocolate);
            sucursalParis.agregarIngrediente(coberturaFresa);


            Equipo horno = new Equipo("Horno");
            Equipo batidora = new Equipo("Batidora");
            sucursalParis.agregarEquipo(horno);
            sucursalParis.agregarEquipo(batidora);


            Crepa crepaChocolate = new Crepa("Crepa de Chocolate", "Grande", 8.99, masaCrepa, rellenoChocolate, coberturaFresa, "Fina");
            Pastel pastelFrances = new Pastel("Gâteau Paris", "Mediano", 24.99, new Masa("Bizcocho", 10.0), new Relleno("Crema", 3.0), new Cobertura("Chocolate", 2.0), "Vainilla");
            sucursalParis.agregarEspecialidad(crepaChocolate);
            sucursalParis.agregarEspecialidad(pastelFrances);


            System.out.println("Operaciones en la Sucursal París:");
            empleado1.trabajar();
            empleado2.tomarOrden();
            horno.encender();
            crepaChocolate.preparar();
            crepaChocolate.servir();
            pastelFrances.preparar();
            horno.apagar();

        } catch (Exception e) {
            System.out.println("Se produjo un error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}