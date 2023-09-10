package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public abstract class Empleado {

	//Atributos
	private String nombre;
	private String direccion;
	private Boolean esCasado;
	private LocalDate fechaDeNacimiento;
	private double sueldoBasico;
	private ReciboDeHaberes reciboDeHaberes;
	
	//Constructor
	public Empleado(String nombre, String direccion, Boolean esCasado, LocalDate fechaDeNacimiento,
			double sueldoBasico) {
		
		this.nombre 		   = nombre;
		this.direccion 		   = direccion;
		this.esCasado 		   = esCasado;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.sueldoBasico	   = sueldoBasico;
	}
	
	//Metodos
	public int calcularEdad() {	
		return LocalDate.now().getYear() - this.fechaDeNacimiento.getYear();
	}
	
	

	public abstract double calcularSueldoBruto();
	public abstract double calcularSueldoNeto();
	public abstract double calcularRetenciones();
	public abstract String desgloce();
	
	public void generarReciboHaberes() {
		
		this.reciboDeHaberes = new ReciboDeHaberes(this.nombre, this.direccion, LocalDate.now(), this.calcularSueldoBruto(),
								   this.calcularSueldoNeto(), this.desgloce());
	}

	
	//Getters and Setters
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Boolean getEsCasado() {
		return esCasado;
	}

	public void setEsCasado(Boolean esCasado) {
		this.esCasado = esCasado;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public ReciboDeHaberes getReciboDeHaberes() {
		return reciboDeHaberes;
	}

	public void setReciboDeHaberes(ReciboDeHaberes reciboDeHaberes) {
		this.reciboDeHaberes = reciboDeHaberes;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	
	
	
	
}
