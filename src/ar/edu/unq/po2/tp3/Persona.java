package ar.edu.unq.po2.tp3;

public class Persona {

	//Atributos
	private String nombre;
	private String apellido;
	private int edad;
	
	
	//Constructor
	public Persona(String nombre, String apellido, int edad) {
		this.nombre   = nombre;
		this.apellido = apellido;
		this.edad 	  = edad;
	}
	
	//Metodos
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public int getEdad() {
		return edad;
	}
	
	
	
	
	
	
}
