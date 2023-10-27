package ar.edu.unq.po2.tp8.Empresa;



public class EmpleadoTemporario extends Empleado {
	
	/*
	 * El sueldo de un empleado Temporario está determinado por el pago de $5 por hora
	 * que trabajó más el sueldo básico que es de $1000,
	 * además se le paga $100 si posee hijos y/o está casado.
	 */
	
	//ATRIBUTOS
	private double sueldoBasico;
	private double pagoPorHora;
	private int horasTrabajadas;
    private boolean esCasado;
    private boolean tieneHijos;
	
	//CONSTRUCTOR
    public EmpleadoTemporario(double sueldoBasico, double pagoPorHora, int horasTrabajadas, boolean esCasado, boolean tieneHijos) {
		this.sueldoBasico 	 = sueldoBasico;
		this.pagoPorHora 	 = pagoPorHora;
		this.esCasado 		 = esCasado;
		this.tieneHijos 	 = tieneHijos;
		this.horasTrabajadas = horasTrabajadas;
	}

    
    
    //METODOS
	
	public double bonoFamiliar() {
		if(this.esCasado || this.tieneHijos) {
			return 100;
		}else {
			return 0;
		}
	}
	
	
	//GETTERS AND SETTERS
	@Override
	public void PagarSueldoBruto() {
		
	    this.setSueldoBruto(this.sueldoBasico + this.horasTrabajadas * this.pagoPorHora + this.bonoFamiliar()); 
		
	}
	
	
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public double getPagoPorHora() {
		return pagoPorHora;
	}


	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}


	public boolean esCasado() {
		return esCasado;
	}


	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}


	public boolean tieneHijos() {
		return tieneHijos;
	}


	public void setTieneHijos(boolean tieneHijos) {
		this.tieneHijos = tieneHijos;
	}



	

	

}
