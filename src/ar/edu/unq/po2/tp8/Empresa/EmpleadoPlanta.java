package ar.edu.unq.po2.tp8.Empresa;

public class EmpleadoPlanta extends Empleado{

	/*
	 * a los empleados de Planta 
	 * se les paga un sueldo básico de $ 3000 
	 * y un plus por cada hijo que posea de $ 150 cada hijo
	 */
	
	//ATRIBUTOS
	private double sueldoBasico;
	private int cantidadHijos;
	
	
	//CONSTRUCTOR
	public EmpleadoPlanta(double sueldoBasico, int cantidadHijos) {
		this.sueldoBasico = sueldoBasico;
		this.cantidadHijos = cantidadHijos;
	}
	
	
	//METODOS
	public double bonusPorHijo() {
		return 150;
	}


	@Override
	public void PagarSueldoBruto() {
		
		this.setSueldoBruto(this.sueldoBasico + this.cantidadHijos * this.bonusPorHijo());
		
	}
	
	//GETTERS AND SETTERS

}
