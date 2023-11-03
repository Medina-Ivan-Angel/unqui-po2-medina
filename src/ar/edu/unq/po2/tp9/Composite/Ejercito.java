package ar.edu.unq.po2.tp9.Composite;

import java.util.ArrayList;
import java.util.List;

// ROL: Composite
public class Ejercito implements Unidad{
	
	//Atributos
	private int posX;
	private int posY;
	private List<Unidad> unidades = new ArrayList<Unidad>();
	
	
	//Constructor
	public Ejercito(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

		
	//Metodo
		
	@Override
	public void caminarA(int x, int y) {

		for(Unidad unidad : unidades) {
			
			unidad.caminarA(x, y);
		}
		
	}
	

	public void addUnidad(Unidad unidad) {
		this.unidades.add(unidad);
	}
	
	public void removerUnidad(Unidad unidad) {
		this.unidades.remove(unidad);
	}
	
	//Getter and setters

}
