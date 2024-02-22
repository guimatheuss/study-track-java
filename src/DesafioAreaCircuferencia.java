import java.util.Scanner;

public class DesafioAreaCircuferencia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double pi = 3.14;

        System.out.println("Digite o raio: ");
        double raio = entrada.nextDouble();

        double resultado = Math.pow(raio, 3) * pi;

        System.out.printf("A área da circunferência é de %.2f m2", resultado);


        entrada.close();
    }
}
