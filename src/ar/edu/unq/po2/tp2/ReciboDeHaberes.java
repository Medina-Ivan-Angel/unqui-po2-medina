package ar.edu.unq.po2.tp2;

import java.time.LocalDate;


public class ReciboDeHaberes {

	
	//Atributos
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaDeEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private String desgloceConceptos;
	//Constructor
	//al crear el recibo de haberes se debe setear los atributos y ejecutar degloce de conceptos.
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaDeEmision,
							double sueldoBruto, double sueldoNeto, String desgloceConceptos) {
		
		this.nombreEmpleado    = nombreEmpleado;
		this.direccion 	       = direccion;
		this.fechaDeEmision    = fechaDeEmision;
		this.sueldoBruto 	   = sueldoBruto;
		this.sueldoNeto 	   = sueldoNeto;
		this.desgloceConceptos = desgloceConceptos;
	}
	
	
	//Metodos
	
	public String desgloce() {
		return this.desgloceConceptos;
	}
	
	
	//Getters and Setters
	
	
	
	
	
	
	
	
}
