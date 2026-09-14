package exerciciowhile;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
