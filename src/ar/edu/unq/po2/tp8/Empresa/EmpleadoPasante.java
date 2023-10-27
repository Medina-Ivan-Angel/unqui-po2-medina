package ar.edu.unq.po2.tp8.Empresa;

public class EmpleadoPasante extends Empleado{
	/*
	 * A los Pasantes se les paga $40 las horas trabajadas en el mes
	 */
	//ATRIBUTOS
	private int horasTrabajadas;
	private double pagoPorHora;
	
	//CONSTRUCTOR
	public EmpleadoPasante(int horasTrabajadas, double pagoPorHora) {
		this.horasTrabajadas = horasTrabajadas;
		this.pagoPorHora = pagoPorHora;
	}

	//METODOS


	
	//GETTERS AND SETTERS

	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getPagoPorHora() {
		return pagoPorHora;
	}

	public void setPagoPorHora(double pagoPorHora) {
		this.pagoPorHora = pagoPorHora;
	}

	@Override
	public void PagarSueldoBruto() {
		
		this.setSueldoBruto(this.horasTrabajadas * this.pagoPorHora);
		
	}

	
}
