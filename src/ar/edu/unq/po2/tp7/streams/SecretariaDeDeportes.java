package ar.edu.unq.po2.tp7.streams;

import java.util.List;
import java.util.ArrayList;

public class SecretariaDeDeportes {

	//ATRIBUTOS
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	
	//METODOS
	
	public void addActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	public List<ActividadSemanal> todasDeFutbol(){
		//TODO: VER STREAMS
	}
	
	
}
