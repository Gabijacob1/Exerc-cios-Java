import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner cat = new Scanner(System.in);

        System.out.print("Digite seu salario: ");
        double Salario = cat.nextDouble();

        double quantidade = (Salario / 1.302);
        double total = quantidade / 1000;

        System.out.print("A quantidade de salario minimo é: " + total);


    }

}