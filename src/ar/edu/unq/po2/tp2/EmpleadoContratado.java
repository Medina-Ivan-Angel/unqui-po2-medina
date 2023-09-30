package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {

	
	//Atributos
	private int numeroContrato;
	private String medioDePago;
	private final double gastosAdministrativos = 50; //Gastos administrativos contractuales
	
	//Constructor
	public EmpleadoContratado(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento,
			double sueldoBasico, int numeroContrato, String medioDePago) {
		super(nombre, direccion, esCasado, fechaDeNacimiento, sueldoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago    = medioDePago;
	}

	//Metodos
	@Override
	public double calcularSueldoBruto() {
		return this.getSueldoBasico();
	}

	@Override
	public double calcularSueldoNeto() {
	
		return this.getSueldoBasico() - this.calcularRetenciones();
	}

	@Override
	public double calcularRetenciones() {
		//Gastos administrativos contractuales
		return this.getGastosAdministrativos();
	}

	@Override
	public String desgloce() {
		
		return  "Empleado: " 				+ this.getNombre() + "\n" +
				"Direccion: " 				+ this.getDireccion() + "\n" +
				"Fecha de Emision: " 		+ LocalDate.now() + "\n" +
				"Desgloce Sueldo Bruto: \n" + 
				"Sueldo Basico: "           + this.getSueldoBasico() + "\n" +
				"Medio de Pago: "			+ this.getMedioDePago()	 + "\n" +
				"Desgloce Retenciones: \n"  +
				"Gastos administrativos contractuales: "+ this.getGastosAdministrativos() + "\n";
			
	}

	

	//Getters and Setters
	public double getGastosAdministrativos() {
		return gastosAdministrativos;
	}

	public String getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}

	
}
