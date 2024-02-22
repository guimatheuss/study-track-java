import java.util.Scanner;

public class DesafioIMC {
    public static void main(String[] args) {
        Scanner calcIMC = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = calcIMC.nextDouble();

        System.out.println("Digite a sua altura: ");
        String altura = calcIMC.next().replace(",", ".");

        double altDois = Double.parseDouble(altura);

        double imc = peso / Math.pow(altDois, 2);

        System.out.printf("Seu IMC é: %.2f", imc);


        calcIMC.close();
    }
}
