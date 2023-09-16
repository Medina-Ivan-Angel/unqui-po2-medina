package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidad extends Producto{
	
	//Atributos
	private double precioProductoPrimeraNecesidad;
	private double descuento;
	
	//Constructor
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}

	//Getters and Setters
	@Override
	public double getPrecio() {
		this.precioProductoPrimeraNecesidad = super.getPrecio() * descuento;
		return precioProductoPrimeraNecesidad;
	}
	
	
	
	
	
}
