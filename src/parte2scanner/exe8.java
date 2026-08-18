package parte2scanner;
import java.util.Scanner;
public class exe8 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = entrada.nextDouble();

        int temperaturaInteira = (int) temperatura;
        double temperaturaConvertida = (double) temperaturaInteira;

        System.out.println("Temperatura original: " + temperatura);
        System.out.println("Temperatura convertida para int: " + temperaturaInteira);
        System.out.println("Temperatura convertida novamente para double: " + temperaturaConvertida);

        entrada.close();
    }
}