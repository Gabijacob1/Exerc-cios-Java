import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.println("Digite sua idade: ");


        System.out.print("anos: ");
        double anos = cat.nextDouble();

        System.out.print("meses: ");
        double mes = cat.nextDouble();

        System.out.print("dias: ");
        double dias = cat.nextDouble();


        double n1 = 365 * anos;
        double n2 = mes * 30;
        double n3 = dias + n2 + n1;
        System.out.println("Sua idade em dias é: " + n3);


    }
}
