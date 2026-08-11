package parte2;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distancia = 420;
        double litros = 35;

        double consumoMedio = distancia / litros;
        double litrosPara100Km = 100 / consumoMedio;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros consumidos: " + litros + " L");
        System.out.println("Consumo médio: " + consumoMedio + " km/L");
        System.out.println("Litros necessários para 100 km: " + litrosPara100Km + " L");
	}

}
