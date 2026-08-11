package parte1;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean possuiIngresso = true;
        boolean possuiDocumento = false;
        boolean acompanhanteMaiorIdade = true;

        // true && false = false, pois é necessário possuir os dois.
        System.out.println(possuiIngresso && possuiDocumento);

        // true || false = true, pois basta possuir um dos dois.
        System.out.println(possuiIngresso || possuiDocumento);

        // !false = true, pois inverte o valor de possuiDocumento.
        System.out.println(!possuiDocumento);

        // false || true = true, depois true && true = true.
        System.out.println(possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade));

        // true && false = false, depois !false = true.
        System.out.println(!(possuiIngresso && possuiDocumento));
	}

}
