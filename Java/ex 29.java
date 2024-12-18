import java.util.Scanner; 
import java.util.Random; 
public class Main {
     public static void main(String[] args) {
         Scanner cat = new Scanner(System.in);
         Random rand = new Random();
         int n1 = rand.nextInt(100) + 1;
         int tentativas = 0;
          System.out.println("Tente adivinhar o número entre 1 e 100!");
           int n2 = 0;
           
            while (n2 != n1) {
                 System.out.print("Digite um número: ");
                  n2 = cat.nextInt();
                  tentativas++;
                  
                   if (n2 < n1) {
                     System.out.println("O número é maior.");
                      } else if (n2 > n1) {
                         System.out.println("O número é menor.");
                         }
                         }
                          System.out.printf("Parabéns! Você acertou em %d tentativa(s).\n", tentativas);
                          cat.close();
                          }
}