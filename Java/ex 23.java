import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner cat = new Scanner(System.in);
        System.out.print("Digite um valor a pagar:");
        int n1 = cat.nextInt();
        System.out.println("Digite o percentual de desconto: ");
        int n2 = cat.nextInt();
        float resultado = (n1 * n2) /100;
        float total = (n1 - resultado);
        System.out.println("Valor a ser pago com o desconto aplicado: " + total);
    }

}
