package ar.edu.unq.po2.tp6.Banco;

public class PropiedadInmobiliaria {
	
	//Atributos
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	
	//Constructor
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion   = direccion;
		this.valorFiscal = valorFiscal;
	}
	
	
	//Getters and Setters
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}
	public void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	
	
	
	
}
