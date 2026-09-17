package parte2scanner;
import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int soma = 0;
        int maior;
        int menor;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                soma += matriz[i][j];

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        double media = (double) soma / (matriz.length * matriz[0].length);

        System.out.println("\nMatriz:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }

        System.out.println("\nSoma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        scanner.close();
    }
}
