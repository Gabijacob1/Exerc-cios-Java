import java.util.Scanner;
public class Ex3{
    public static class Círculo{
        private double raio;
        private double comprimento;
        private double area;

        public Círculo(double raio) {
            this.raio = raio;
        }
        public void calcularcomprimento(){
            this.comprimento = 2 * Math.PI * raio;
        }
        public void calculararea(){
            this.area = Math.PI * Math.pow(raio,2);
        }

        public double getRaio() {
            return raio; }

        public void setRaio(double raio){
            this.raio = raio;
        }

        public double getComprimento(){
            return comprimento;
        }
        public void setComprimento(double comprimento){
            this.comprimento = comprimento;

        }

        public double getArea(){
            return area;
        }

        public void setArea(double area){
            this.area = area;
        }



    }

    public static void main(String[] args) {
        double raio = Math.random();

        Círculo circulo = new Círculo(raio);
        circulo.calcularcomprimento();
        circulo.calculararea();


        System.out.printf("Comprimento: %.2f\n", + circulo.getComprimento());
        System.out.printf("Area: %.2f\n", + circulo.getArea());
        System.out.printf("Raio: %.2f\n", +circulo.getRaio());
    }
}