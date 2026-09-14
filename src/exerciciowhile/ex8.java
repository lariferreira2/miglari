package exerciciowhile;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 1;

        do {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            soma = soma + numero;
            contador++;
        } while (contador <= 5);

        System.out.println("Soma = " + soma);

        scanner.close();
    }
}
