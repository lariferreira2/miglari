package exerciciowhile;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int quantidade = 0;
        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a nota: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            soma = soma + nota;
            quantidade++;

            System.out.print("Deseja cadastrar outro aluno? (S/N): ");
            resposta = scanner.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        double media = soma / quantidade;

        System.out.println("Média das notas = " + media);

        scanner.close();
    }
}
