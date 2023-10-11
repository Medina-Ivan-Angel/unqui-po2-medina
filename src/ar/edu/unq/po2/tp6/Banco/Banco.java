package ar.edu.unq.po2.tp6.Banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	//Atributos
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Solicitud> solicitudes = new ArrayList<Solicitud>();
	
	//Metodos
	
	//Agregar un cliente a la lista de clientes
	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	//Agregar solicitud a la lista de solicitudes TODO: ¿No es peligroso añadir solicitudes sin validar en el metodo registro?
	public void addSolicitud(Solicitud solicitud) {
		solicitudes.add(solicitud);
	}
	
	
	
	//Añadir solicitud a la lista de solicitudes e ingresa el monto solicitado
	// al cliente "solicitante" si dicha solicitud es hallada valida. TODO: (¿Mucha responsabilidad
	// para este metodo?)
	public void registrarSolicitud(Solicitud solicitud) {
		
		//Validar solicitud
		solicitud.validar();
		
		//Registrar solicitud
		this.addSolicitud(solicitud);
		
		//Realizar pago si corresponde
		if(solicitud.getEsValido()) {
			this.desembolsarMontoSolicitado(solicitud);
		}
		
	}
	
	//Desembolsa el monto establecido en la solicitud dada por parametro al cliente correspondiente.
	public void desembolsarMontoSolicitado(Solicitud solicitud) {
		solicitud.getSolicitante().setSaldo(solicitud.getSolicitante().getSaldo() + solicitud.getMontoSolicitado());
	}
	
	
	
	/*
	 * Calcular el monto total de dinero a desembolsar por el banco,
	 * lo cual se obtiene como la sumatoria del monto solicitado de
	 * todas las solicitudes de crédito registradas que sean aceptables.
	 */
	
	public double getMontoTotalAPagar() {
		
		//monto total a pagar
		double montoTotal = 0;
		
		//Recorremos la lista de solicitudes y acumulamos los montos de aquellas que son validas.
		for(Solicitud solicitud : solicitudes) {
			
			if(solicitud.getEsValido()) {
				montoTotal += solicitud.getMontoSolicitado();
			}
			
		}
		
		return montoTotal;
	}

	//Getters and Setters
	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<Solicitud> getSolicitudes() {
		return solicitudes;
	}

}
