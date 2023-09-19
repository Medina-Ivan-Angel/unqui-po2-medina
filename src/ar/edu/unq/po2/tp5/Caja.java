package ar.edu.unq.po2.tp5;

public class Caja {

	//Atributos
	private Mercado mercado;
	
	//Constructor
	public Caja (Mercado mercado) {
		this.mercado = mercado;
	}
	
	//Metodos
	public double registrarProducto(Producto producto) {
		
		//Consultar el precio del producto y acumularlo en el monto a pagar (Cliente)		
		//Decrementar el stock existente (Mercado)
		
		
		//Si el producto esta devolver el precio, sino 0.
		if(mercado.getStock().contains(producto)) {
			mercado.remover(producto);
			return producto.getPrecio();
		}else {
			return 0;
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
