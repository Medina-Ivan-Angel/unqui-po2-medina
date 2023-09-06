package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	//Atributos
	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

	
	//Metodos
	
	public void addNumber(int numero) {
		
		this.listaDeNumeros.add(numero);
		
	}


	public int getEvenOcurrences() {
		
		int contadorDePares = 0;
		
		for(Integer numero: listaDeNumeros) {
			
			contadorDePares += unoSiEsParCeroSiNo(numero);
			
		}
		
		return contadorDePares;
		
	}
	
	public int unoSiEsParCeroSiNo(int numero) {
		
		if(numero % 2 == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int getOddOcurrences() {
			
			int contadorDeImpares = 0;
			
			for(Integer numero: listaDeNumeros) {
				
				contadorDeImpares += unoSiEsImparCeroSiNo(numero);
				
			}
			
			return contadorDeImpares;
			
		}
	
	public int unoSiEsImparCeroSiNo(int numero) {
		
		if(numero % 2 != 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public int getMultipleOcurrences(int multiplo) {
		
		int contadorDeMultiplos = 0;
		
		for(Integer numero: listaDeNumeros) {
			
			contadorDeMultiplos += unoSiEsMultiploCeroSiNo(numero, multiplo);
			
		}
		
		return contadorDeMultiplos;
		
	}

	public int unoSiEsMultiploCeroSiNo(int numero, int multiplo) {
		
		if(numero % multiplo == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	/* 3)
	 * Realice una función que reciba dos valores X e Y, y devuelva el número más alto 
	 * entre 0 y 1000, que sea múltiplo simultáneamente de X e Y. Si no existe,
	 * devolver -1. Por ejemplo si se ingresa 3 y 9, la función debe
	   devolver 999
	 */
	
	public int maximoMultiploEntre(int x, int y) {
		
		int maximoMultiplo = 0;
		
		for(int i = 0; i <= 1000; i++) {
			
			if(esMultiploSimultaneoDe(i, x, y)) {
				maximoMultiplo = i;
			}
			
		}
		
		if(maximoMultiplo != 0) {
		   return maximoMultiplo;
		}else {
			return -1;
		}
		
		
	}
	
	public boolean esMultiploSimultaneoDe(int n, int x, int y) {
		
		return (n % x == 0) && (n % y == 0);
	}
	
	
	
}
