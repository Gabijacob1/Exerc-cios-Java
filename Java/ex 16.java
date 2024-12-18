import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double alt = cat.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = cat.nextDouble();
        double imc = peso / (alt * alt);
        System.out.println(imc);
    }
}