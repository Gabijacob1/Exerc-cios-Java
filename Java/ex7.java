import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static class Supermercado {
        double totalCompra;

        public Supermercado() {
            totalCompra = 0.0;
        }

        public void comprar(String nomeProduto, int quantidade, double precoUnitario) {
            double valorPagar = quantidade * precoUnitario;
            System.out.println("Produto: " + nomeProduto);
            System.out.println("Quantidade: " + quantidade);
            System.out.printf("Valor unitário: R$ %.2f\n", precoUnitario);
            System.out.printf("Valor a pagar: R$%.2f\n", valorPagar);
            totalCompra += valorPagar;
            System.out.println();
        }

        public void pagar(int formaPagamento) {
            System.out.printf("Total a pagar: R$%.2f\n", totalCompra);
            double desconto = 0.0;
            String formaPagamentoStr = "";

            switch (formaPagamento) {
                case 1:
                    desconto = 5.0;
                    formaPagamentoStr = "Dinheiro";
                    break;
                case 2:
                    desconto = 2.0;
                    formaPagamentoStr = "Cartão";
                    break;
                case 3:
                    formaPagamentoStr = "Cheque";
                    break;
                default:
                    System.out.println("Forma de pagamento inválida");
                    return;
            }

            totalCompra -= desconto;
            System.out.println("Forma de pagamento: " + formaPagamentoStr);
            System.out.printf("Valor final da compra: R$%.2f\n", totalCompra);
        }

        public static void main(String[] args) {
            Supermercado mercado = new Supermercado();

            mercado.comprar("Arroz", 2, 10.5);
            mercado.comprar("Feijão", 3, 5.8);

            mercado.pagar(1);
        }
    }
}