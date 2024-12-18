import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner cat = new Scanner(System.in);
        System.out.print("Digite seu salario: ");
        int n1 = cat.nextInt();

       double pri =  (0.05 * n1)+ n1;

       double sec = (0.10 * n1)+ n1;

       double ter = (0.15 * n1)+ n1;

        System.out.println("Valor de 5%: " + pri);
        System.out.println("Valor de 10%: " + sec);
        System.out.println("Valor de 15%: " + ter);
    }

}