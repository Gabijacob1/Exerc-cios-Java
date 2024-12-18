import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
     Scanner cat = new Scanner(System.in);

     System.out.print("Digite sua idade: ");
      int idade = cat.nextInt();
       System.out.print("Digite o ano em que estamos: "); 
     int ano = cat.nextInt();
     int total = ano - idade;
     System.out.println("Você nasceu em: " + total); }
      }