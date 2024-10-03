
import java.util.Scanner;

public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contador = 0;

        for (char caractere : texto.toCharArray()) {
            if (caractere == 'a' || caractere == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vezes.");
    }
}
