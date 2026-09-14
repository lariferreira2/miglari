package exerciciowhile;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de início: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o número de finalização: ");
        int fim = scanner.nextInt();

        int i = inicio;

        do {
            System.out.println(i);
            i++;
        } while (i <= fim);

        scanner.close();
    }
}