package parte2scanner;
import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];

        int pares = 0;
        int impares = 0;
        int maioresQue10 = 0;
        int menoresOuIguaisA10 = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numeros[i] > 10) {
                maioresQue10++;
            } else {
                menoresOuIguaisA10++;
            }
        }

        System.out.println("\nQuantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Maiores que 10: " + maioresQue10);
        System.out.println("Menores ou iguais a 10: " + menoresOuIguaisA10);

        scanner.close();
    }
}
