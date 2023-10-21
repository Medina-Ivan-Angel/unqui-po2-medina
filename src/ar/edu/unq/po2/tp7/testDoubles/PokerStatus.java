package ar.edu.unq.po2.tp7.testDoubles;

import java.util.ArrayList;
import java.util.List;

public class PokerStatus {

	//Atributos
	
	//Constructor
	
	
	//Metodos
	public String verificar(String carta1,
							 String carta2,
							 String carta3,
							 String carta4,
							 String carta5) {
		
		List<String> mano = new ArrayList<String>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
			
		//El orden en que se evaluan cada uno debe seguir la jerarquia del tipo de mano.
		//CODIGO FEO
		if(HayPoquer(mano)) {
			return "Poquer";
		}else if(HayTrio(mano)) {
			return "Trio";
		}else if(HayColor(mano)) {
			return "Color";
		}else {
			return "Nada";
		}
		
	}
	
	
	public boolean HayPoquer(List<String> mano) {
		
		return (this.contarAses(mano) == 4 || this.contarReyes(mano) == 4); 
	}
		
	
	public boolean HayTrio(List<String> mano) {
		//Tres cartas con el mismo numero hacen Trio
		
		//CODIGO FEO
		int coincidencias = 0;
		
		for(String carta: mano) {
			
			//Contamos las coincidencias que hay con cada carta
			coincidencias = this.contarCartasIgualesA(mano, carta);
			
			//Si hay trio, salimos del for sino restauramos el valor de coincidencias
			if(coincidencias == 3) {
				break;
			}else {
				coincidencias = 0;
			}
			
		}
		
		return coincidencias == 3;
		
	}
	
	public boolean HayColor(List<String> mano) {
		//5 Cartas del mismo palo hacen Color
		
		return false;
	}
	
	public int contarCartasIgualesA(List<String> mano, String cartaAComparar) {
		
		int coincidencias = 0;
		
		for(String carta : mano) {
			
			if(carta.charAt(0) == cartaAComparar.charAt(0)) {
				coincidencias++;
			}
			
		}
		
		
		return coincidencias;
	}
	
	
	public int contarAses(List<String> mano) {
		
		int cantidadAses = 0;
		
		//Contabilizamos solo las que empiezan con 1 (Ases)
		for(String carta : mano) {
			
			if(carta.startsWith("1")) {
				cantidadAses++;
			}
			
			
		}
		return cantidadAses;
	}
	
	
	public int contarReyes(List<String> mano) {
		
		int cantidadReyes = 0;
		
		
		//Contabilizamos las que contienen una K (Reyes)
		for(String carta : mano) {
			
			if(carta.contains("K")) {
				cantidadReyes++;
			}
		}
		return cantidadReyes;
	}
}
