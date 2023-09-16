package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidad extends Producto{
	
	//Atributos
	private double precioProductoPrimeraNecesidad;
	
	
	//Constructor
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		
	}

	//Getters and Setters
	@Override
	public double getPrecio() {
		this.precioProductoPrimeraNecesidad = super.getPrecio() * 0.9;
		return precioProductoPrimeraNecesidad;
	}
	
	
	
	
	
}
