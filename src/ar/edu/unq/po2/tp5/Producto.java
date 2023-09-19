package ar.edu.unq.po2.tp5;

public abstract class Producto {

	//Atributos
	protected double precio;
	
	public Producto(double precio) {
		this.precio = precio;
	}
	
	//Metodos
	public abstract double getPrecio();
	
}
