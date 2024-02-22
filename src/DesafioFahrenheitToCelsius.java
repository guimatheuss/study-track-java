import java.util.Scanner;

public class DesafioFahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempF = temp.nextDouble();

        double resultadoC = (tempF - 32) / 1.8;

        System.out.println("A temperatura em Celsius é de: " + resultadoC);


        temp.close();
    }
}
