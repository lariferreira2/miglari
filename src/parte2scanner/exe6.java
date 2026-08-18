package parte2scanner;
import java.util.Scanner;
public class exe6 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância em quilômetros: ");
        double quilometros = entrada.nextDouble();

        double metros = quilometros * 1000;

        System.out.println("Quilômetros: " + quilometros + " km");
        System.out.println("Metros: " + metros + " m");

        entrada.close();
    }
}