package parte2scanner;
import java.util.Scanner;

public class exe10-foreach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[5][4];

        for (int i = 0; i < notas.length; i++) {

            System.out.println("\nAluno " + (i + 1));

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Digite a nota da avaliação " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }

        double maiorMedia = 0;
        double menorMedia = 0;

        int alunoMaiorMedia = 0;
        int alunoMenorMedia = 0;

        double somaGeral = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {

            double somaAluno = 0;

            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
                somaGeral += notas[i][j];
            }

            double mediaAluno = somaAluno / notas[i].length;

            System.out.println(
                "Aluno " + (i + 1) + " - Média: " + mediaAluno
            );

            if (i == 0) {
                maiorMedia = mediaAluno;
                menorMedia = mediaAluno;
            }

            if (mediaAluno > maiorMedia) {
                maiorMedia = mediaAluno;
                alunoMaiorMedia = i;
            }

            if (mediaAluno < menorMedia) {
                menorMedia = mediaAluno;
                alunoMenorMedia = i;
            }

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        double mediaTurma = somaGeral / (notas.length * notas[0].length);

        System.out.println("\nNotas dos alunos:");

        int numeroAluno = 1;

        for (double[] aluno : notas) {

            System.out.print("Aluno " + numeroAluno + ": ");

            for (double nota : aluno) {
                System.out.print(nota + " ");
            }

            System.out.println();

            numeroAluno++;
        }

        System.out.println("\nMaior média: Aluno "
                + (alunoMaiorMedia + 1) + " - " + maiorMedia);

        System.out.println("Menor média: Aluno "
                + (alunoMenorMedia + 1) + " - " + menorMedia);

        System.out.println("Média da turma: " + mediaTurma);

        System.out.println("Alunos aprovados: " + aprovados);

        /*
         * No for-each não precisamos e não controlamos diretamente o índice para acessar os valores da matriz
         * Por isso, usamos uma variável separada para mostrar o número do aluno.
         * Mas como queremos exibir "Aluno 1", "Aluno 2", etc., utilizamos a variável numeroAluno.
         * O for tradicional é necessário quando precisamos saber a posição (índice) do elemento.
         */

        scanner.close();
    }
}