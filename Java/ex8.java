import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static class Pessoa {
        private String nome;
        private int anoNascimento;
        private double altura;
        private double peso;

        public void calcularIMC() {
            double imc = peso / Math.pow(altura, 2);
            String condicao;

            if (imc < 18.5) {
                condicao = "Abaixo do peso";
            } else if (imc < 25) {
                condicao = "Peso normal";
            } else if (imc < 30) {
                condicao = "Sobrepeso";
            } else if (imc < 35) {
                condicao = "Obesidade grau I";
            } else if (imc < 40) {
                condicao = "Obesidade grau II";
            } else {
                condicao = "Obesidade grau III";
            }

            System.out.println("Nome: " + nome);
            System.out.printf("IMC: %.2f\n", imc);
            System.out.println("Condição: " + condicao);
        }

        public void calcularIdade() {

            int idade = LocalDate.now().getYear() - anoNascimento;
            String cnh = (idade >= 18) ? "Pode tirar CNH" : "Não pode tirar CNH";
            String voto;

            if (idade >= 18 && idade <= 70) {
                voto = "Voto obrigatório";
            } else if (idade >= 16 || idade >= 70) {
                voto = "Voto opcional";
            } else {
                voto = "Não pode votar";
            }

            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
            System.out.println(cnh);
            System.out.println(voto);
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Pessoa pessoa = new Pessoa();

            System.out.print("Digite o nome: ");
            pessoa.nome = scanner.nextLine();

            System.out.print("Digite o ano de nascimento: ");
            pessoa.anoNascimento = scanner.nextInt();

            System.out.print("Digite o peso em kg: ");
            pessoa.peso = scanner.nextDouble();

            System.out.print("Digite a altura em metros: ");
            pessoa.altura = scanner.nextDouble();

            System.out.println("--- Cálculo do IMC ---");
            pessoa.calcularIMC();

            System.out.println();

            System.out.println("--- Cálculo da idade ---");
            pessoa.calcularIdade();
        }
    }
}