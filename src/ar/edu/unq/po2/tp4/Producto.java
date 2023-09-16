package ar.edu.unq.po2.tp4;

public class Producto {

	//Atributos
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado = false;
	
	//Constructores
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre 		 = nombre;
		this.precio 		 = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public Producto(String nombre, double precio) {
		this.nombre 		 = nombre;
		this.precio 		 = precio;
	}
	
	//Metodos
	public boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		this.precio += aumento;
	}
	
	//Getters and Setters
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double newPrecio) {
		this.precio = newPrecio;
	}
}
