import java.util.Scanner;

public class Validadores {

    public static void menuValidadores() {
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n=== VALIDADORES ===");
            System.out.println("1. Zodiaco");
            System.out.println("2. Mayoría de edad");
            System.out.println("3. Número perfecto");
            System.out.println("4. Palíndromo");
            System.out.println("5. Capicúa");
            System.out.println("6. Volver");
            System.out.print("Opción: ");
            op = leer.nextInt();

            switch (op) {
                case 1 -> zodiaco();
                case 2 -> mayoriaEdad();
                case 3 -> numeroPerfecto();
                case 4 -> palindromo();
                case 5 -> capicua();
            }
        } while (op != 6);
    }

    public static void zodiaco() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Día: "); int dia = leer.nextInt();
        System.out.print("Mes: "); int mes = leer.nextInt();

        String signo = switch (mes) {
            case 1 -> (dia < 20) ? "Capricornio" : "Acuario";
            case 2 -> (dia < 19) ? "Acuario" : "Piscis";
            case 3 -> (dia < 21) ? "Piscis" : "Aries";
            case 4 -> (dia < 20) ? "Aries" : "Tauro";
            case 5 -> (dia < 21) ? "Tauro" : "Géminis";
            case 6 -> (dia < 21) ? "Géminis" : "Cáncer";
            case 7 -> (dia < 23) ? "Cáncer" : "Leo";
            case 8 -> (dia < 23) ? "Leo" : "Virgo";
            case 9 -> (dia < 23) ? "Virgo" : "Libra";
            case 10 -> (dia < 23) ? "Libra" : "Escorpio";
            case 11 -> (dia < 22) ? "Escorpio" : "Sagitario";
            case 12 -> (dia < 22) ? "Sagitario" : "Capricornio";
            default -> "Mes inválido";
        };
        System.out.println("Tu signo es: " + signo);
    }

    public static void mayoriaEdad() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = leer.nextInt();
        System.out.println(edad >= 18 ? "Es mayor de edad." : "Es menor de edad.");
    }

    public static void numeroPerfecto() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Número: ");
        int n = leer.nextInt(), suma = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) suma += i;
        System.out.println(suma == n ? "Es número perfecto" : "No lo es");
    }

    public static void palindromo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Texto: ");
        String texto = leer.nextLine();
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(texto.equalsIgnoreCase(invertido) ? "Es palíndromo" : "No es palíndromo");
    }

    public static void capicua() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Número: ");
        int num = leer.nextInt();
        String texto = Integer.toString(num);
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println(texto.equals(invertido) ? "Es capicúa" : "No es capicúa");
    }
}