import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);

        System.out.print("Digite uma estação do ano em maiúsculo: ");
        String estacao = cat.nextLine();
        switch (estacao) {
            case "OUTONO":
                System.out.println("Este Mês tem 31 dias ");
                break;
            case "INVERNO":
                System.out.println("De 21 de junho a 23 de setembro");
                break;
            case "PRIMAVERA":
                System.out.println("De 23 de setembro a 21 de dezembro");
                break;
            case "VERÃO":
                System.out.println("De 21 de dezembro a 21 de março");
                break;
            default:
                System.out.println("Estação inválida");
                break;
                
        }
    }
}
