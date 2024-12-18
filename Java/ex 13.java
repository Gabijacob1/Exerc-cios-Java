import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);

        System.out.print("Digite uma senha com 4 números: ");
        int numero = cat.nextInt();

        if (numero == 2149) {
            System.out.println("open");
        } else {
            System.out.println("error password");
        }
    }
}
