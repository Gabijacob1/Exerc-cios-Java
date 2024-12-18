import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite o comprimento do terreno: ");
        double com = cat.nextDouble();

        System.out.println("Digite a altura do terreno: ");
        double alt = cat.nextDouble();
        double area = com * com;
        double perimetro = alt * 4;

        System.out.println("A área será de: " + area);
        System.out.println("o perimetro será de: " + perimetro);
    }

}