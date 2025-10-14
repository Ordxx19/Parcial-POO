import java.util.ArrayList;
import java.util.Scanner;

public class GestorCaballeros {
    ArrayList<Caballero> lista = new ArrayList<>();
    Scanner leer = new Scanner(System.in);

    public void menuCaballeros() {
        int op;
        do {
            System.out.println("\n=== GESTOR DE CABALLEROS ===");
            System.out.println("1. Crear caballero");
            System.out.println("2. Mostrar caballeros");
            System.out.println("3. Eliminar caballero");
            System.out.println("4. Batalla");
            System.out.println("5. Volver");
            System.out.print("Opción: ");
            op = leer.nextInt();

            switch (op) {
                case 1 -> crearCaballero();
                case 2 -> mostrarCaballeros();
                case 3 -> eliminarCaballero();
                case 4 -> batalla();
            }
        } while (op != 5);
    }

    public void crearCaballero() {
        System.out.print("Nombre: ");
        String nombre = leer.next();
        System.out.print("Constelación: ");
        String constelacion = leer.next();
        System.out.print("Dios: ");
        String dios = leer.next();
        System.out.print("Cosmos: ");
        int cosmos = leer.nextInt();

        System.out.print("Nombre de la armadura: ");
        String arm = leer.next();
        Armadura a = new Armadura(arm, true, 100);

        Caballero c = new Caballero(nombre, constelacion, dios, cosmos, a);
        lista.add(c);
        System.out.println("Caballero creado con éxito!");
    }

    public void mostrarCaballeros() {
        if (lista.isEmpty()) System.out.println("No hay caballeros.");
        else lista.forEach(System.out::println);
    }

    public void eliminarCaballero() {
        mostrarCaballeros();
        System.out.print("Ingrese el índice a eliminar (0,1,2...): ");
        int i = leer.nextInt();
        if (i >= 0 && i < lista.size()) {
            lista.remove(i);
            System.out.println("Caballero eliminado.");
        } else System.out.println("Índice no válido.");
    }

    public void batalla() {
        if (lista.size() < 2) {
            System.out.println("Debe haber al menos dos caballeros para luchar.");
            return;
        }

        mostrarCaballeros();
        System.out.print("Ingrese el número del primer caballero: ");
        int c1 = leer.nextInt();
        System.out.print("Ingrese el número del segundo caballero: ");
        int c2 = leer.nextInt();

        Caballero a = lista.get(c1);
        Caballero b = lista.get(c2);

        Caballero ganador = (a.cosmos > b.cosmos) ? a : b;
        System.out.println("El ganador es: " + ganador.nombre + " de " + ganador.constelacion);
    }

    }
