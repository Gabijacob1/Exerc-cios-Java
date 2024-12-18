import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n1 = cat.nextInt();

        int dobro = n1 * 2;
        int triplo = n1 * 3;
        System.out.println("Dobro do numero: " + dobro);
        System.out.println("triplo do numero: " + triplo);
    }
}