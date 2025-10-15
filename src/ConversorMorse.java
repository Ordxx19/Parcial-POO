import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConversorMorse {
    static Map<Character, String> morse = new HashMap<>();

    static {
        morse.put('A', ".-"); morse.put('B', "-...");
        morse.put('C', "-.-."); morse.put('D', "-..");
        morse.put('E', "."); morse.put('F', "..-.");
        morse.put('G', "--."); morse.put('H', "....");
        morse.put('I', ".."); morse.put('J', ".---");
        morse.put('K', "-.-"); morse.put('L', ".-..");
        morse.put('M', "--"); morse.put('N', "-.");
        morse.put('O', "---"); morse.put('P', ".--.");
        morse.put('Q', "--.-"); morse.put('R', ".-.");
        morse.put('S', "..."); morse.put('T', "-");
        morse.put('U', "..-"); morse.put('V', "...-");
        morse.put('W', ".--"); morse.put('X', "-..-");
        morse.put('Y', "-.--"); morse.put('Z', "--..");
    }

    public static void menuMorse() {
        Scanner leer = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n=== CONVERSOR MORSE ===");
            System.out.println("1. Texto a Morse");
            System.out.println("2. Morse a Texto");
            System.out.println("3. Volver");
            System.out.print("Opción: ");
            op = leer.nextInt(); leer.nextLine();

            switch (op) {
                case 1 -> textoAMorse();
                case 2 -> morseATexto();
            }
        } while (op != 3);
    }

    public static void textoAMorse() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Texto: ");
        String texto = leer.nextLine().toUpperCase();
        StringBuilder morseTexto = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (morse.containsKey(c))
                morseTexto.append(morse.get(c)).append(" ");
            else if (c == ' ')
                morseTexto.append("/ ");
        }
        System.out.println("En Morse: " + morseTexto);
    }

    public static void morseATexto() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Código Morse: ");
        String[] codigo = leer.nextLine().split(" ");
        StringBuilder texto = new StringBuilder();

        for (String c : codigo) {
            if (c.equals("/")) texto.append(" ");
            else {
                for (Map.Entry<Character, String> entry : morse.entrySet()) {
                    if (entry.getValue().equals(c)) texto.append(entry.getKey());
                }
            }
        }
        System.out.println("Texto: " + texto);
    }
}