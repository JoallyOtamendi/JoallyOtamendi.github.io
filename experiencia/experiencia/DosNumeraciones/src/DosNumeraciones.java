public class DosNumeraciones {
int numeroA; 
int numeroB;

public void numeracion() {
	for (int i=0;i<=100;i ++) {
		System.out.printf(numeroA + ", ");
		System.out.printf(numeroB + ", ");
		numeroA +=2;
		numeroB +=3;
	}
	
	
}

public int getNumeroA() {
	return numeroA;
}

public void setNumeroA(int numeroA) {
	this.numeroA = numeroA;
}

public int getNumeroB() {
	return numeroB;
}

public void setNumeroB(int numeroB) {
	this.numeroB = numeroB;
}

}
