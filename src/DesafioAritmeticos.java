public class DesafioAritmeticos {
    public static void main(String[] args) {

        int div = 10;
        var dividendo = Math.pow(div, 3);
        var calculoUm = (3 + 2) * 6;
        var calculoUmResultado = Math.pow(calculoUm, 2);
        int resultadoUm = (int) calculoUmResultado / (3 * 2);

        var calculoDois = (1 - 5) * (2 - 7);
        var calculoDoisResultado = calculoDois / 2;
        int resultadoDois = (int) Math.pow(calculoDoisResultado, 2);

        var calculoTres = (resultadoUm - resultadoDois);
        var resultadoTres = (int) Math.pow(calculoTres, 3) / dividendo;
        System.out.println((int) resultadoTres);


    }
}
