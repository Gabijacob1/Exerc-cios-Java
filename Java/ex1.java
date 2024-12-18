import java.util.Scanner;

public class contar0_ate_X {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);

        System.out.print("Digite um valor inteiro N: ");
        int N = cat.nextInt();

        int contagem = 0;

        while (contagem <= N) {
            System.out.println(contagem);
            contagem++;
        }

        cat.close();

    }
}