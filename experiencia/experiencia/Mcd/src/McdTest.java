public class McdTest {

	public static void main(String[] args) {
		Mcd oMcd = new Mcd();
		oMcd.setNumeroDos(4);
		oMcd.setNumeroUno(12);
		oMcd.calcularMcd();
		oMcd.getResultado();
		System.out.println(oMcd.getResultado());
	}

}
