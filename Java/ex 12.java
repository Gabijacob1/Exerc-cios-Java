import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(21);
        int b = random.nextInt(21);
        System.out.println("Número a: " + a);
        System.out.println("Número b: " + b);

        if (b % a == 0) {
            double resultado = (double) b / a;
            System.out.println("b é múltiplo de a. Resultado da divisão: " + resultado);
        } else {
            int resultado = a + b;
            System.out.println("b não é múltiplo de a. Resultado da adição: " + resultado);
        }
    }
}
