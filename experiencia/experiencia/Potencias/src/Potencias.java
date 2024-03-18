public class Potencias {
	int base;
	public int exponenteLimite;
	int resultados = 0;
	int potencia = 0;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getExponenteLimite() {
		return exponenteLimite;
	}

	public void setExponenteLimite(int exponenteLimite) {
		this.exponenteLimite = exponenteLimite;
	}
	

	public int getResultados() {
		return resultados;
	}

	public void calcularPotencias() {
		for (int i = 0; i <= exponenteLimite; i++) {
			if (i == 0) {
				resultados +=1;
			} else {
				if (i == 1) {
					resultados =resultados+ base;
				} else {
					for (int j = 2; j <= i; j++) {
						if (j==2) {
							potencia = base*base;
						}
						else {
							potencia = potencia * base;
					}
					}
					resultados+= potencia;
					potencia = 0; // se resetea potencia para calcular la siguiente
				}

			}
			
		}
		
	}
}