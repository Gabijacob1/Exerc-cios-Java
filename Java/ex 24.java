import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner info = new  Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = info.nextLine();
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = info.nextInt();
        int total = 2023 - ano;
        System.out.println(nome + " tem " + total + " anos");

    }

}