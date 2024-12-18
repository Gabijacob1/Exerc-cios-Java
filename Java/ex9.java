import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Digite a primeira idade: ");
        double id1 = cat.nextDouble();

        System.out.print("Digite a segunda idade : ");
        double id2 = cat.nextDouble();
        double conta = id1 - id2;
        if (id1 > id2){
            System.out.println("A primeira idade é mais velha ");
        }

        else if (id2 >id1){
            System.out.print("A segunda idade é mais velha");
        }
        else {
            System.out.print("Os dois tem a mesma idade");
        }
        }
    }