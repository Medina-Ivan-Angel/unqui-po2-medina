package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso{


	//Atributos
	private int horasExtras;
	
	
	//Constructor

	public IngresoHorasExtras(String mes, String concepto, double montoPercibido, int horasExtras) {
		super(mes, concepto, montoPercibido);
		this.horasExtras = horasExtras;
	}
	
	//Metodos
	//Getters and Setters
	@Override
	public double getMontoImponible() {
		return 0;
	}
	
	
}

