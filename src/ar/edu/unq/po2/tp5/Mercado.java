package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	//Atributos
	private List<Producto> stock = new ArrayList<Producto>();
	
	
	//Metodos
	public void remover(Producto producto) {
		
		stock.remove(producto);
		
	}
	
	public void agregar(Producto producto) {
		
		stock.add(producto);
	}
	
	
	//Getters and Setters
	public List<Producto> getStock() {
		return this.stock;
	}
	
	
	
	
	
	
	
}
