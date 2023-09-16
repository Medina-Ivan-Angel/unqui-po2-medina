package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	
	//Atributos
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	//Constructor
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	//Metodos
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	


	//Getters and Setters
	public int getCantidadDeProductos() {
		
		int counter = 0;
		for(Producto producto : productos) {
			counter += 1;
		}
		
		return counter;
		
	}
	
	public double getPrecioTotal() {
		
		double precioTotal = 0;
		for(Producto producto : productos) {
			
			precioTotal += producto.getPrecio();
			
		}
		
		return precioTotal;
	}
	
	
	
}
