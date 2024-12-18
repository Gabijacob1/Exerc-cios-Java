import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n1 = cat.nextInt();

        int antecessor  = n1 - 1;
        int sucessor = n1 + 1 ;
        System.out.println("Antecessor do numero: " + antecessor);
        System.out.println("Sucessor do numero: " + sucessor);
    }
}