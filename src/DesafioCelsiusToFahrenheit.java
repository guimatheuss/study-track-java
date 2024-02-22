import java.util.Scanner;

public class DesafioCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double tempC = entrada.nextDouble();

        double resultado = (tempC * 1.8) + 32;

        System.out.println("O resultado em Fahrenheit é: " + resultado);

        entrada.close();
    }
}
