import java.util.Random;
public class aleatorioMenorOuIgualEParando20 {


    public static void main(String[] args) {
        Random cat = new Random();
        int NAleatorio;
        int contador = 0;

        do {
            NAleatorio = cat.nextInt(21);
            System.out.println("Número aleatório: " + NAleatorio);
            contador++;
        } while (NAleatorio != 20);
        System.out.println("Foram gerados " + contador + " números antes de atingir o valor 20.");
    }
}