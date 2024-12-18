import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int mes = random.nextInt(12) + 1;

        System.out.println("Dias no mes: " + mes);

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                System.out.println("Este Mês tem 31 dias ");
                break;

            case 2:
                System.out.println("Esse Mês tem 28 ou 29 dias");
                break;

            default:
                System.out.println("Este mês tem 30 dias ");
                break;
        }
    }
}
