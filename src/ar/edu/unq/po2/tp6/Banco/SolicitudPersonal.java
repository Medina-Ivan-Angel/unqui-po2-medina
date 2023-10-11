package ar.edu.unq.po2.tp6.Banco;

public class SolicitudPersonal extends Solicitud {

	//Constructor
	public SolicitudPersonal(Cliente solicitante, double montoSolicitado, int mesesPlazo) {
		super(solicitante, montoSolicitado, mesesPlazo);
		
	}

	
	//Metodos
	
	@Override
	public void validar() {
		/*
		 * Los créditos personales requieren que el solicitante tenga ingresos anuales
		 *  por al menos $15000, y que el monto de la cuota no supere 
		 *  el 70% de sus ingresos mensuales.
		 *  TODO: abstraer la condicion del if para hacerlo mas legible
		 */
		if(this.getSolicitante().getSueldoNetoAnual() >= 15000 &&
		   this.getCuotaMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.7) {
			
			//Validamos la solicitud
			this.setEsValido(true);
		}
		
		
	}

}
