import java.util.Scanner;

public class ConversorMorse {

    // Método principal para el menú del conversor
    public static void menuMorse() {
        Scanner leer = new Scanner(System.in);
        System.out.println("=== CONVERSOR A CÓDIGO MORSE ===");
        System.out.print("Ingrese un texto para convertir: ");
        String texto = leer.nextLine().toUpperCase();

        String morse = convertirAMorse(texto);
        System.out.println("Texto en Morse:");
        System.out.println(morse);
    }

    // Método que convierte texto a código Morse
    public static String convertirAMorse(String texto) {
        String[] letras = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        String[] numeros = {
            "-----", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----."
        };

        String morse = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                morse += letras[c - 'A'] + " ";
            } else if (c >= '0' && c <= '9') {
                morse += numeros[c - '0'] + " ";
            } else if (c == ' ') {
                morse += "/ "; // separador entre palabras
            }
        }

        return morse;
    }
}
