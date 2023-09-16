package ar.edu.unq.po2.tp4;

import java.util.List;
import java.util.ArrayList;


public class Trabajador {

	
	//Atributos
	private List<Ingreso> ingresosAnuales = new ArrayList<Ingreso>();
	
	
	//Metodos
	public void agregarIngreso(Ingreso ingreso) {
		ingresosAnuales.add(ingreso);
	}
	
	
	//Getters and Setters
	public double getTotalPercibido() {
		
		double totalPercibido = 0;
		for(Ingreso ingreso : ingresosAnuales) {
			totalPercibido += ingreso.getMontoPercibido();
		}
		return totalPercibido;
		
	}
	
	public double getMontoImponible() {
		
		double totalMontoImponible = 0;
		for(Ingreso ingreso : ingresosAnuales) {
			totalMontoImponible += ingreso.getMontoImponible();
		}
		return totalMontoImponible;
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
}
