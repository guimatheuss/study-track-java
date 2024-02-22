import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o salário do primeiro mês: ");
        String salarioUm = entrada.next().replace(",", ".");

        System.out.println("Digite o salário do segundo mês: ");
        String salarioDois = entrada.next().replace(",", ".");

        System.out.println("Digite o salário do terceiro mês: ");
        String salarioTres = entrada.next().replace(",", ".");

        double mesUm = Double.parseDouble(salarioUm);
        double mesDois = Double.parseDouble(salarioDois);
        double mesTres = Double.parseDouble(salarioTres);

        double media = (mesUm + mesDois + mesTres) / 3;

        System.out.println("A média salárial é de: " + media);

        entrada.close();
    }
}
