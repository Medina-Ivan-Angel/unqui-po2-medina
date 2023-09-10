package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public class EmpleadoTemporal extends Empleado {
	
	
	//Atributos
	private LocalDate finDesignacion;
	private int  horasExtras;
	
	//Constructor
	public EmpleadoTemporal(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento,
			double sueldoBasico, LocalDate finDesignacion, int horasExtras) {
		
		super(nombre, direccion, esCasado, fechaDeNacimiento, sueldoBasico);
		this.finDesignacion = finDesignacion;
		this.horasExtras 	= horasExtras;
		
	}

	
	//Metodos
	@Override
	public double calcularSueldoBruto() {
		
		return	this.getSueldoBasico() + this.bonusPorHorasExtra();
	}

	@Override
	public double calcularSueldoNeto() {
		
		return this.calcularSueldoBruto() - this.calcularRetenciones();
	}

	@Override
	public double calcularRetenciones() {
		
		return this.retencionObraSocial() + this.aportesJubilatorios();
	}
	
	
	public double retencionObraSocial() {
		return this.bonusPorAntiguedad() + this.calcularSueldoBruto() * 0.10;
	}
	
	
	public double bonusPorAntiguedad() {
		if(this.calcularEdad() > 50) {
			return 25;
		}else {
			return 0;
		}
	}
	
	public double aportesJubilatorios() {
		
		return this.calcularSueldoBruto() * 0.10 + (5 * this.horasExtras);
		
	}
	
	public double bonusPorHorasExtra() {
		return 40 * this.horasExtras;
	}
	
	
	public String desgloce() {
		
		return  "Empleado: " 				+ this.getNombre() + "\n" +
				"Direccion: " 				+ this.getDireccion() + "\n" +
				"Fecha de Emision: " 		+ LocalDate.now() + "\n" +
				"Desgloce Sueldo Bruto: \n" + 
				"Sueldo Basico: "           + this.getSueldoBasico() + "\n" +
				"Bonus Horas Extra: "       + this.bonusPorHorasExtra() + "\n" +
				"Desgloce Retenciones: \n"  +
				"Obra Social: " 		    + this.retencionObraSocial() + "\n" +
				"Aportes Jubilatorios: "    + this.aportesJubilatorios();
				
				
	}
	
	
	//Getters and Setters
	public LocalDate getFinDesignacion() {
		return finDesignacion;
	}

	public void setFinDesignacion(LocalDate finDesignacion) {
		this.finDesignacion = finDesignacion;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	
}
