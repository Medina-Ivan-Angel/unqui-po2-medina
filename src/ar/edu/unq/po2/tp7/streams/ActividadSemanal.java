package ar.edu.unq.po2.tp7.streams;

import java.time.LocalTime;
import java.util.List;

public class ActividadSemanal {

	//ATRIBUTOS
	private DiaDeLaSemana diaDeLaSemana;
	private LocalTime horaDeInicio;
	private double duracion;
	private Deporte deporte;
	private double costo;
	
	// LocalTime.of(15, 30, 0); // 15:30:00
	
	//CONSTRUCTOR
	public ActividadSemanal(DiaDeLaSemana diaDeLaSemana, 
							LocalTime horaDeInicio,
							double duracion,
							Deporte deporte) {
		
		this.diaDeLaSemana = diaDeLaSemana;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}
	
	
	
	//METODOS
	
	
	//GETTERS AND SETTERS
	public double getCosto() {
		
		double costoTotal = 0;
		
		if(this.diaDeLaSemana == DiaDeLaSemana.LUNES  ||
		   this.diaDeLaSemana == DiaDeLaSemana.MARTES ||
		   this.diaDeLaSemana == DiaDeLaSemana.MIERCOLES) {
			
			costoTotal = 500 + this.deporte.getComplejidad() * 200;
		}else {
			
			costoTotal = 1000 + this.deporte.getComplejidad() * 200 ;
		}
		
		return costoTotal;
		
	}


	public Deporte getDeporte() {
		return deporte;
	}
	
	public double getDuracion() {
		return duracion;
	}

	
	
	
	
	
	
	
}
