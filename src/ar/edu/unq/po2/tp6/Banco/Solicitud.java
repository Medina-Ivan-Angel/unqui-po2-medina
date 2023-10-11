package ar.edu.unq.po2.tp6.Banco;

public abstract class Solicitud {
	
	//Atributos
	private boolean esValido;//falso por defecto
	private Cliente solicitante;
	private double montoSolicitado;
	private int mesesPlazo;
	private double cuotaMensual;
	
	//Constructor
	public Solicitud(Cliente solicitante, double montoSolicitado, int mesesPlazo) {
		this.solicitante = solicitante;
		this.montoSolicitado = montoSolicitado;
		this.mesesPlazo = mesesPlazo;
		
		//Dada una solicitud, se obtiene el monto de la cuota mensual 
		// dividiendo el monto solicitado por la
		// cantidad de cuotas "mesesPlazo" (considerando que se abona una cuota por mes).
		
		this.cuotaMensual = montoSolicitado / mesesPlazo;
		
	}
	
	//Metodos
	public abstract void validar(); //A definir por las clases hijas

	//Getters and Setters
	public boolean getEsValido() {
		return esValido;//falso por defecto
	}
	//TODO: Seria peligroso que alguien accediera a este metodo y validara su solicitud 
	// antes de que lo haga el banco.
	public void setEsValido(boolean esValido) {
		this.esValido = esValido;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}


	public int getMesesPlazo() {
		return mesesPlazo;
	}

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
