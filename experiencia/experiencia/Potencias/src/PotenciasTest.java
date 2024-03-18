
public class PotenciasTest {

	public static void main(String[] args) {
		Potencias oPotencias=new Potencias();
		oPotencias.setBase(1);
		oPotencias.setExponenteLimite(2);
		oPotencias.calcularPotencias();
		System.out.println(oPotencias.getResultados());
	}

}
