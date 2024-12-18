import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner cat = new Scanner(System.in);

        System.out.print("Digite o valor de pagamento: ");
        float pag = cat.nextFloat();
        System.out.print("Digite a quantidade de litros de gasolina: ");
        float litro = cat.nextFloat();

        float total = pag / litro ;

        System.out.print("O valor do combustivel é: " + total);


    }

}