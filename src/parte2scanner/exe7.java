package parte2scanner;
import java.util.Scanner;
public class exe7 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = entrada.nextDouble();

        int notaInteira = (int) nota;
        double notaConvertida = (double) notaInteira;

        System.out.println("Nota original: " + nota);
        System.out.println("Nota convertida para int: " + notaInteira);
        System.out.println("Nota convertida novamente para double: " + notaConvertida);

        entrada.close();
    }
}