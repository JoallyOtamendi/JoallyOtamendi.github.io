public class SerieFibonacci {
	int fin; 

public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

public void fibonacci() {
	int numeroUno=0; 
	int numeroDos=1;
	int auxiliar; 
	
	
	for (int i = 0;i<fin;i++) {
		
		int suma = numeroUno+numeroDos; 
		System.out.println(suma+", ");
		auxiliar=suma;
		numeroUno=numeroDos;
		numeroDos = auxiliar;
	}
}
}
