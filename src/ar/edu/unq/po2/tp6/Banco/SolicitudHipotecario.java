package ar.edu.unq.po2.tp6.Banco;

public class SolicitudHipotecario extends Solicitud {

	//Atributos
	private PropiedadInmobiliaria garantia;
	
	//Constructor
	public SolicitudHipotecario(Cliente solicitante, double montoSolicitado, int mesesPlazo, PropiedadInmobiliaria garantia) {
		super(solicitante, montoSolicitado, mesesPlazo);
		this.garantia = garantia;
	}

	
	//Metodos
	@Override
	public void validar() {
		
		/*
		 * Las solicitudes de créditos hipotecarios requieren 
		 * que el monto de la cuota no supere el 50% de los ingresos 
		 * mensuales del titular, que el monto total solicitado no sea
		 * mayor al 70% del valor fiscal de la garantía, y que la persona
		 * no supere los 65 años de edad antes de terminar de pagar el crédito.
		 * 
		 * TODO: abstraer la condicion del if para hacerla mas legible
		 * TODO: La condicion de edad establece que debe ser menor de 65 AL TERMINAR DE PAGAR, falta eso.
		 */
		
		if(this.getCuotaMensual() > this.getSolicitante().getSueldoNetoMensual() * 0.5 &&
		   this.getMontoSolicitado() < this.getGarantia().getValorFiscal() * 0.7         &&
		   this.getSolicitante().getEdad() < 65) {
			
			//Validamos la solicitud
			this.setEsValido(true);
		}
		
		
		
	}

	
	//Getters and Setters
	
	public PropiedadInmobiliaria getGarantia() {
		return this.garantia;
	}
	
	
	
	
	
	
}
