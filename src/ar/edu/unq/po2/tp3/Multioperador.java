package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	//Atributos
	
	
	//Metodos
	
	public int sumarTodos(ArrayList<Integer> listaDeEnteros) {
		
		int suma = 0;
		
		for(Integer i : listaDeEnteros) {
			suma += i;
		}
		
		return suma;
	}
	
	public int restarTodos(ArrayList<Integer> listaDeEnteros) {
		
		int resta = listaDeEnteros.get(0);
		
		for(int i = 1; i < listaDeEnteros.size(); i++) {
			resta -= listaDeEnteros.get(i);
		}
		
		return resta;
	}
	
	public int multiplicarTodos(ArrayList<Integer> listaDeEnteros) {
		
		int resultado = 1;
		
		for(int i = 0; i < listaDeEnteros.size(); i++) {
			
			resultado *= listaDeEnteros.get(i);
		}
		
		return resultado;
	}
	
	
}
