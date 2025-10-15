import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        GestorCaballeros gestor = new GestorCaballeros();
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Validadores");
            System.out.println("3. Gestor de Caballeros del Zodiaco");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1 -> Validadores.menuValidadores();
                case 2 -> ConversorMorse.menuMorse();
                case 3 -> gestor.menuCaballeros();
                case 4 -> System.out.println("Saliendo del programa...");
                case 5 -> new MiJuego().jugar();
                default -> System.out.println("Opción no válida");
            }

        } while (opcion != 4);
    }
}
