package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	
	//Atributos
	private double montoTotalAPagar;
	private List<Producto> listaDeCompra = new ArrayList<Producto>();
	private Caja caja;
	
	//Constructor
	public Cliente(Caja caja) {
		this.caja = caja;
	}
	
	
	//Metodos
	public void registrarProductos() {
		
		//Recorremos toda la lista de compras y registramos los productos 
		// en la caja que nos va devolviendo el precio de cada uno.
		for(Producto producto : listaDeCompra) {
			montoTotalAPagar += caja.registrarProducto(producto);
		}
		
	}
	
	public void agregar(Producto producto) {
		listaDeCompra.add(producto);
	}
	
	public void remover(Producto producto) {
		listaDeCompra.remove(producto);
	}
	
	
	//Getters and Setters
	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}
	
	
}
