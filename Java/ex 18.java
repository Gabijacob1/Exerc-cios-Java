import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite sua 1° nota: ");
        double n1 = cat.nextDouble();

        System.out.print("Digite sua 2° nota: ");
        double n2 = cat.nextDouble();

        System.out.print("Digite sua 3° nota: ");
        double n3 = cat.nextDouble();

        System.out.print("Digite sua 4° nota: ");
        double n4 = cat.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A media do aluno será: " + media);



    }
}