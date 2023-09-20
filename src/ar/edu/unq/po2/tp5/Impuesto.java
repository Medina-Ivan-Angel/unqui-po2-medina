package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	
	//Atributos
	private double tasa;
	
	//Constructor
	public Impuesto(double tasa) {
		this.tasa = tasa;
	}
	
	//Metodos
	@Override
	public double getMontoAPagar() {
		
		return this.tasa;
	}

}
