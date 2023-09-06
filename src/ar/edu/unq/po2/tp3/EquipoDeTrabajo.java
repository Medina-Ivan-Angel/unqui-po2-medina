package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {

	//Atributos
	private String nombre;
	private ArrayList<Persona> integrantes = new ArrayList<Persona>();
	
	
	
	//Constructor
	
	
	//Metodos
	public int promedioEdadIntegrantes() {
		
		int totalEdad = 0;
		
		for(Persona p : integrantes) {
			
			totalEdad += p.getEdad();
		}
		
		return totalEdad / this.integrantes.size();
	}
	
	public void agregarIntegrante(Persona p) {
		this.integrantes.add(p);
	}
	
	
	public static void main(String[] args) {
		

		EquipoDeTrabajo eq = new EquipoDeTrabajo();
		Persona p1 = new Persona("Ivan", "Medina", 32);
		Persona p2 = new Persona("Juan", "Mendez", 12);
	    Persona p3 = new Persona("Luis", "Gonzalez", 22);
		Persona p4 = new Persona("Tamara", "Gutierrez", 60);
	    Persona p5 = new Persona("Laura", "Chamarro", 40);

		eq.agregarIntegrante(p1);
		eq.agregarIntegrante(p2);
		eq.agregarIntegrante(p3);
		eq.agregarIntegrante(p4);
		eq.agregarIntegrante(p5);
		
		System.out.println("El promedio de edades es: " + eq.promedioEdadIntegrantes());
	}
	
	
	
	
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	
	
	
}
