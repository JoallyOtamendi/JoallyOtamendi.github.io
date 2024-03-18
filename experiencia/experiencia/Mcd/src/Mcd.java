public class Mcd {
	int numeroUno;
	int numeroDos;
	int resultado;
	

	public int getNumeroUno() {
		return numeroUno;
	}


	public void setNumeroUno(int numeroUno) {
		this.numeroUno = numeroUno;
	}


	public int getNumeroDos() {
		return numeroDos;
	}


	public void setNumeroDos(int numeroDos) {
		this.numeroDos = numeroDos;
	}


	public int getResultado() {
		return resultado;
	}


	public void setResultado(int resultado) {
		this.resultado = resultado;
	}


	public void calcularMcd() {
		int modulo = 0;
		if (numeroUno < numeroDos) {
			if (numeroDos % numeroUno == 0)
				resultado = numeroUno;

			else if (numeroDos % numeroUno != 0) {

				modulo = numeroDos % numeroUno;
				for (int i = 1; i <= numeroUno; i++) {
					if (numeroUno % modulo == 0)
						resultado = modulo;
					else
						modulo = numeroUno % modulo;
				}
			}

		} else {
			if (numeroUno > numeroDos) {
				if (numeroUno % numeroDos == 0)
					resultado = numeroDos;

				else if (numeroUno % numeroDos != 0) {
					modulo = numeroUno % numeroDos;
					for (int i = 1; i <= numeroDos; i++) {
						if (numeroDos % modulo == 0)
							resultado = modulo;
						else
							modulo = numeroDos % modulo;
					}
				}
			}

		}
		
	}

}
