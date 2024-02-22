import java.util.Scanner;

public class DesafioQuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número a ser calculado: ");
        double num = entrada.nextDouble();

        double resultado1 = Math.pow(num, 2);
        double resultado2 = Math.pow(num, 3);

        System.out.println("O resultado ao quadrado é de: " + resultado1);
        System.out.println("O resultado ao cubo é de: " + resultado2);



        entrada.close();
    }
}
