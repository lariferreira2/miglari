package parte2scanner;
import java.util.Scanner;

public class exe5-foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] valores = new double[10];

        double soma = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = scanner.nextDouble();
        }

        for (double valor : valores) {
            soma += valor;
        }

        double media = soma / valores.length;

        double maior = valores[0];
        double menor = valores[0];
        
        for (double valor : valores) {
            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        int acimaDaMedia = 0;

        for (double valor : valores) {
            if (valor > media) {
                acimaDaMedia++;
            }
        }

        System.out.println("\nValores:");

        for (double valor : valores) {
            System.out.print(valor + " ");
        }

        System.out.println("\n\nSoma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade acima da média: " + acimaDaMedia);

        /*
         * Resposta do desafio:
         * No for tradicional precisamos controlar o índice (i),
         * principalmente quando precisamos saber a posição do elemento.
         *
         * No for-each não precisamos controlar o índice, pois
         * ele percorre diretamente os valores do array.
         */

        scanner.close();
    }
}
