
public class Edad {
	    
	    int diaActual;
		int mesActual;
		int anoActual;
		int diaNacimiento;
		int mesNacimiento;
		int anoNacimiento;
	
		

		
		public int Edad (int diaActual, int mesActual, int anoActual, int diaNacimiento, int mesNacimiento, int anoNacimiento) {
			int edadUno;
			int edadDos;
			int edad =0 ;
			edadUno=anoActual-anoNacimiento;
			edadDos=anoActual-anoNacimiento-1;
			
			if (mesNacimiento>mesActual) {
				edad=edadDos;
			}
				else { 
					if (mesNacimiento<=mesActual) {
						if (diaNacimiento<diaActual) {
							edad = edadUno;
						}
					}
			}
			if (mesActual == mesNacimiento) {
				if (diaActual == diaNacimiento) {
				}
			}		
			return edad;
	}
		
		
	public int getDiaActual() {
		return diaActual;
	}
	public void setDiaActual(int diaActual) {
		this.diaActual = diaActual;
	}
	public int getMesActual() {
		return mesActual;
	}
	public void setMesActual(int mesActual) {
		this.mesActual = mesActual;
	}
	public int getAnoActual() {
		return anoActual;
	}
	public void setAnoActual(int anoActual) {
		this.anoActual = anoActual;
	}
	public int getDiaNacimiento() {
		return diaNacimiento;
	}
	public void setDiaNacimiento(int diaNacimiento) {
		this.diaNacimiento = diaNacimiento;
	}
	public int getMesNacimiento() {
		return mesNacimiento;
	}
	public void setMesNacimiento(int mesNacimiento) {
		this.mesNacimiento = mesNacimiento;
	}
	public int getAnoNacimiento() {
		return anoNacimiento;
	}
	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento = anoNacimiento;
	}

	
}

