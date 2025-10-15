import java.util.Scanner;
public class MiJuego {
    public void jugar() {
        Scanner sc = new Scanner(System.in);
        String[] opciones = {"piedra", "papel", "tijera"};
        int comp = (int)(Math.random() * 3);

        System.out.print("Elige (piedra, papel o tijera): ");
        String jugador = sc.next().toLowerCase();

        System.out.println("La computadora eligió " + opciones[comp]);

        if (jugador.equals(opciones[comp]))
            System.out.println("Empate 😐");
        else if ((jugador.equals("piedra") && opciones[comp].equals("tijera")) ||
                (jugador.equals("papel") && opciones[comp].equals("piedra")) ||
                (jugador.equals("tijera") && opciones[comp].equals("papel")))
            System.out.println("¡Ganaste! 🎉");
        else
            System.out.println("Perdiste 💀");
    }
}