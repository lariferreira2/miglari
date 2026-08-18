package parte2scanner;
import java.util.Scanner;
public class exe13 {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Possui CNH? (true/false): ");
        boolean possuiCNH = entrada.nextBoolean();

        System.out.print("Possui carro? (true/false): ");
        boolean possuiCarro = entrada.nextBoolean();

        System.out.print("Possui dinheiro? (true/false): ");
        boolean possuiDinheiro = entrada.nextBoolean();

        System.out.println(possuiCNH && possuiCarro);

        System.out.println(possuiCarro || possuiDinheiro);

        System.out.println(!possuiCNH);

        System.out.println(possuiCNH && possuiDinheiro);

        System.out.println(!(possuiCarro || possuiDinheiro));

        entrada.close();
    }
}