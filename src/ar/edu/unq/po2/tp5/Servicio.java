package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	
	//Atributos
	private double costoPorUnidad;
	private double cantidadUnidadesConsumidas;
	
	//Constructor
	public Servicio(double costoPorUnidad, double cantidadUnidadesConsumidas) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
		
	}
	
	//Metodos
	@Override
	public double getMontoAPagar() {
		
		return this.costoPorUnidad * this.cantidadUnidadesConsumidas;
	}

}
