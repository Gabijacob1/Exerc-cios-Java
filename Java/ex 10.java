import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = cat.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }
}