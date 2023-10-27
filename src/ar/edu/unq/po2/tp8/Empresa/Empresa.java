package ar.edu.unq.po2.tp8.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	
	//ATRIBUTOS
	private List<Empleado> empleados = new ArrayList<Empleado>();
	
	//CONSTRUCTOR
	
	
	//METODOS
	public void addEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void liquidarSueldos() {
		for(Empleado empleado : empleados) {
			empleado.sueldo();
		}
	}
	
	//GETTERS AND SETTERS
}
