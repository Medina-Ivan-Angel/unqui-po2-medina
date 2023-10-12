package ar.edu.unq.po2.tp7.streams;

public enum Deporte {
	
	RUNNING(1),
	FUTBOL(2),
	BASKET(2),
	TENIS(3),
	JAVALINA(4);
	
	//ATRIBUTOS
	private int complejidad;
	
	
	//CONSTRUCTOR
	Deporte(int complejidad) {
		this.complejidad = complejidad;
	}
	
	
	//Metodos
	public int getComplejidad() {
		return this.complejidad;
	}
	
	
}
