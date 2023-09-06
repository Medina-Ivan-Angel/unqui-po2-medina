package ar.edu.unq.po2.tp3;

import java.util.Date;

public class PersonaPunto10 {

	//Atributos
	private String nombre;
	private Date fechaNacimiento;
	
	//Constructor
	public PersonaPunto10(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	//Metodos
	
	
	/*PREGUNTA
		Si un objeto cualquiera que le pide la edad a una Persona: (1)¿Conoce cómo ésta calcula u
	    obtiene tal valor? (2)¿Cómo se llama el mecanismo de abstracción que permite esto?
	
	* RESPUESTA:
	* 1) No, no conoce la implementacion por la cual se obtiene la edad.
	  2) El mecanismo de abstraccion se llama "abstraccion de datos"
	*/
	
	public int edad() {
		return 2023 - fechaNacimiento.getYear();
	}
	
	public boolean menorQue(PersonaPunto10 persona) {
		
		return persona.edad() < this.edad();
		
	}
	
	public PersonaPunto10 persona(String nombre, Date fechaNacimiento) {
		
		return new PersonaPunto10(nombre, fechaNacimiento);
		
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
