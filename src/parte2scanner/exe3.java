package parte2scanner;
import java.util.Scanner;
public class exe3 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (km): ");
        double distancia = entrada.nextDouble();

        System.out.print("Digite os litros consumidos: ");
        double litros = entrada.nextDouble();

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros consumidos: " + litros + " L");
        System.out.println("Consumo médio: " + consumoMedio + " km/L");
        System.out.println("Litros necessários para 100 km: " + litrosPara100Km + " L");

        entrada.close();
    }
}