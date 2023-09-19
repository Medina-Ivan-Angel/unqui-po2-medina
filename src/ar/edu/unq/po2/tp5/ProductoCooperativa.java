package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	
	//Atributos
	private final double descuentoIVA = 0.10;
	
	//Constructor
	public ProductoCooperativa(double precio) {
		super(precio);
		
	}

	
	//Metodos
	//Getters and Setters
	@Override
	public double getPrecio() {
		//precio viene de la superClase Producto.
		return precio - (precio * descuentoIVA);
	}

}
