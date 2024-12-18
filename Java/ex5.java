import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite  um número decimal: ");
        double numero = cat.nextDouble();
        double Baixo = Math.floor(numero);
        double Cima = Math.ceil(numero);
        double Aritimético = Math.round(numero);

        System.out.printf("Arrendondamento para Baixo: %.2f\n", Baixo);
        System.out.printf("Arrendondamento para Cima: %.2f\n", Cima);
        System.out.printf("Arredondamento Aritimético: %.2f\n", Aritimético);
    }
}