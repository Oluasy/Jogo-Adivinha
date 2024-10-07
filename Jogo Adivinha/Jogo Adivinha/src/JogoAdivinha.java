import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberTyped = 0;
        int trys = 0;
        int randomNumber = random.nextInt(100);
        System.out.println("Tente adivinhar o número aleatório entre 0 a 100!");

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número entre 0 a 100: ");
            numberTyped = scanner.nextInt();
            trys++;

            if (numberTyped > randomNumber) {
                System.out.println("O número digitado é maior que o número gerado.");
                System.out.println();
            } else if (numberTyped < randomNumber) {
                System.out.println("O número digitado é menor que o número gerado.");
                System.out.println();
            } else if (numberTyped == randomNumber) {
                System.out.println("Parabéns, você acertou o número em " + trys + " tentativas!");
                break;
            }
            System.out.println(randomNumber);
        }

        if (trys == 5) {
            System.out.println("Você não conseguiu acertar o número gerado em 5 tentativas, o número era: " + randomNumber);

        }
    }
}