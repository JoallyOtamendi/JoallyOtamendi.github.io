
public class Numeros {
	
	    double numeroA;
		double numeroB;
		double numeroC;
		double numeros;
	
	public void numeros () {
		if (numeroA > numeroB) {
			if (numeroC < numeroB) {
				System.out.println("" + numeroA + " " + numeroB + " " + numeroC);
			}

			else if (numeroC > numeroA) {
				System.out.println("" + numeroC + " " + numeroA + " " + numeroB);
			} else if (numeroC < numeroA) {
				System.out.println("" + numeroA + " " + numeroC + " " + numeroB);
			}

		} 
		else if(numeroC < numeroA) {
			System.out.println("" + numeroB+ " " + numeroA + " " + numeroC);
			
		}
		else if(numeroC > numeroA) {
			System.out.println("" + numeroC + " " + numeroB + " " + numeroA);
			
		}
		else System.out.println("" + numeroB + " " + numeroC + " " + numeroA);
		}

	
	public double getNumeroA() {
		return numeroA;
	}


	public void setNumeroA(double numeroA) {
		this.numeroA = numeroA;
	}


	public double getNumeroB() {
		return numeroB;
	}


	public void setNumeroB(double numeroB) {
		this.numeroB = numeroB;
	}


	public double getNumeroC() {
		return numeroC;
	}


	public void setNumeroC(double numeroC) {
		this.numeroC = numeroC;
	}



	}