package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

	//Atributos
	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	//Metodos
	public double montoTotalNeto() {
		double totalSueldoNeto = 0;
		
		for(Empleado empleado: empleados) {
			totalSueldoNeto += empleado.calcularSueldoNeto();
		}
		
	
		
		return totalSueldoNeto;
		
		
	}
	
	public double montoTotalBruto() {
		
		double totalSueldoBruto = 0;
		
		for(Empleado empleado: empleados) {
			totalSueldoBruto += empleado.calcularSueldoBruto();
		}
		
		return totalSueldoBruto;
	}
	
	public double montoTotalRetenciones() {
		
		double totalRetenciones = 0;
		
		for(Empleado empleado: empleados) {
			totalRetenciones += empleado.calcularRetenciones();
		}
		
		return totalRetenciones;
	}
	
	public void liquidarSueldos() {
		
		for(Empleado empleado : empleados) {
			empleado.generarReciboHaberes();
		}
		
		
	}
	
	public void addEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	
	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	
	
	
	
	
	
	
	
}
