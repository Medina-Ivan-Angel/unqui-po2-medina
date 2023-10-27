package ar.edu.unq.po2.tp8.Empresa;

public abstract class Empleado {
	
	//ATRIBUTOS
	private double sueldoBruto;
	//CONSTRUCTOR
	
	
	
	//METODOS
	//Este es el template method
	protected void sueldo() {
		
		this.PagarSueldoBruto();   // hook method
		this.descontarAportes(); // Operacion concreta
		
	}

	
	private void descontarAportes() {
		
		this.sueldoBruto -= this.getSueldoBruto() * 0.13;
	}


	//GETTERS AND SETTERS
	
	public double getSueldoBruto() {
		return sueldoBruto;
	}

	

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}


	public abstract void PagarSueldoBruto();
	

}
