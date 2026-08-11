package parte2;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     	boolean chovendo = true;
	        boolean guardaChuva = false;
	        boolean carroDisponivel = true;

	        System.out.println(chovendo && guardaChuva);

	        System.out.println(guardaChuva || carroDisponivel);

	        System.out.println(!chovendo);

	        System.out.println(chovendo && (guardaChuva || carroDisponivel));

	        System.out.println(!(chovendo && guardaChuva));
	}

}
