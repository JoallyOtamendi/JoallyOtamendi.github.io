public class InvertirNumeros {
int numero;


	public int getNumero() {
	return numero;
}


public void setNumero(int numero) {
	this.numero = numero;
}


	public void invertir(){
	int numeroUno;
	int numeroDos;
	int numeroTres; 
	
	numeroUno=numero/100;
	numeroDos=(numero-(numeroUno*100))/10;
	numeroTres=numero-(numeroUno*100)-(numeroDos*10);
	
	System.out.println(numeroTres +""+ numeroDos +""+ numeroUno);
	
	int centenaNuevo=numeroTres*100;
	int decenasNuevo=numeroDos*10;
	int numeroNuevo=centenaNuevo+decenasNuevo+numeroUno;

	
	if (numero==numeroNuevo)
			System.out.println("Es un palíndromo");
	else System.out.println("No es un palíndromo");
	}
}
