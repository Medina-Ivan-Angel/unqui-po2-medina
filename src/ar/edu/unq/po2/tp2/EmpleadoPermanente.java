package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	

	//Atributos
	private int cantidadHijos;
	private int antiguedad;
	
	
	
	//Constructor
	public EmpleadoPermanente(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento,
			double sueldoBasico, int cantidadHijos, int antiguedad) {
		
		super(nombre, direccion, esCasado, fechaDeNacimiento, sueldoBasico);
		this.cantidadHijos = cantidadHijos;
		this.antiguedad    = antiguedad;
	}
	
	//Metodos
	@Override
	public double calcularSueldoBruto() {
		return this.getSueldoBasico() + this.salarioFamiliar() + this.bonusPorAntiguedad();
	}

	@Override
	public double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}

	@Override
	public double calcularRetenciones() {
		return	this.retencionObraSocial() + this.bonusPorHijo() + this.aportesJubilatorios();
	}
	
	public double retencionObraSocial() {
		return this.calcularSueldoBruto() * 0.10;
	}
	
	public double aportesJubilatorios() {
		return this.calcularSueldoBruto() * 0.15;
	}
	
	public double salarioFamiliar() {
		return 150 * this.cantidadHijos + this.bonusPorConyuge();
	}
	
	public double bonusPorConyuge() {
		if(this.getEsCasado()) {
			return 100;
		}else {
			return 0;
		}
	}
	
	public double bonusPorHijo() {
		return 20 * this.cantidadHijos;
	}
	
	public double bonusPorAntiguedad() {
		return this.antiguedad * 50;
	}

	public String desgloce() {
		
		return  "Empleado: " 				+ this.getNombre() + "\n" +
				"Direccion: " 				+ this.getDireccion() + "\n" +
				"Fecha de Emision: " 		+ LocalDate.now() + "\n" +
				"Desgloce Sueldo Bruto: \n" + 
				"Sueldo Basico: "           + this.getSueldoBasico() + "\n" +
				"Salario Familiar: "        + this.salarioFamiliar() + "\n" +
				"Bonus Por Antiguedad: "    + this.bonusPorAntiguedad() + "\n" +
				"Desgloce Retenciones: \n"  +
				"Obra Social: " 		    + this.retencionObraSocial() + "\n" +
				"Bonus por Hijo: " 		    + this.bonusPorHijo() + "\n" +
				"Aportes Jubilatorios: "    + this.aportesJubilatorios();
				
				
	}
	
	
	
	//Getters and Setters
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	
	
	
}
