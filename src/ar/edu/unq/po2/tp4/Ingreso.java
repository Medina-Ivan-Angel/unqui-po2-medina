package ar.edu.unq.po2.tp4;

public class Ingreso {

	
	//Atributos
	private String mes;
	private String concepto;
	private double montoPercibido;
	
	//Constructor
	public Ingreso(String mes, String concepto, double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	
	//Getters and Setters
	public double getMontoPercibido() {
	
		return this.montoPercibido;
	}

	

	public double getMontoImponible() {
		
		return this.montoPercibido;
	}

}
