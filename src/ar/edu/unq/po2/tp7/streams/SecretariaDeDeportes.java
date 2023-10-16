package ar.edu.unq.po2.tp7.streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class SecretariaDeDeportes {

	//ATRIBUTOS
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();
	
	
	//METODOS
	
	//Añadir actividad a la lista de actividades
	public void addActividad(ActividadSemanal actividad) {
		actividades.add(actividad);
	}
	
	//Devuelve todas las actividades de Futbol.
	public List<ActividadSemanal> todasDeFutbol(){
		
		//Filtramos y devolvemos solo las actividades que sean tipo FUTBOL.
		return actividades.stream()
			   .filter(a -> a.getDeporte().equals(Deporte.FUTBOL))
			   .toList();
		
		
	}
	
	/*
	 * Devuelve todas las actividades de una complejidad recibida como parámetro.
	 */
	
	public List<ActividadSemanal> actividadesConComplejidad(int complejidad){
		
		return actividades.stream()
			   .filter(a -> a.getDeporte().getComplejidad() == complejidad)
			   .toList();
		
	}
	
	
	/*
	 * Cantidad de horas totales de actividadesSemanales que ofrece el Municipio
	 */
	
	public double horasTotalesDeActividad() {
		
		return actividades.stream()
			   .map(a -> a.getDuracion())
			   .mapToDouble(Double::doubleValue) //Nos deshacemos del wrapper y lo pasamos todo a double (primitivo)
			   .sum();
		
	}
	
	
	/*
	 * La actividadSemanal de menor costo para un Deporte (FUTBOL por ejemplo) de
	   interés recibido por parámetro. Si hay más de uno con el mismo costo es indistinto
	   cual devuelve. Devuelve una ActividadSemanal
	   Se sugiere investigar la función min de streams y el uso del método
	   Comparator.comparing().
	 */
	
	public ActividadSemanal actividadMasBarataPara(Deporte deporte) {
		//TODO: Que hago aca?
		
		return actividades.stream()
		
	}
	
	
	
}
