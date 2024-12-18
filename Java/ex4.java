import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite  um número: ");
        double numero = cat.nextDouble();
        double Quadrada = Math.sqrt(numero);
        double Cubica = Math.cbrt(numero);

        System.out.printf("Raiz quadrada: %.2f\n", Quadrada);
        System.out.printf("Raiz cúbica: %.2f\n", Cubica);
    }
}
