package ar.edu.unq.po2.tp7.streams;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SecretariaDeDeportesTest {

	SecretariaDeDeportes secretaria;
	ActividadSemanal  act1;
	ActividadSemanal  act2;
	ActividadSemanal  act3;
	ActividadSemanal  act4;
	ActividadSemanal  act5;
	
	
	@BeforeEach
	public void setUp() throws Exception{
		
		//Instanciamos la secretaria de deportes
		secretaria = new SecretariaDeDeportes();
		
		
		//Instanciamos las actividades semanales
		act1 = new ActividadSemanal(DiaDeLaSemana.LUNES, 
									LocalTime.of(15, 30, 0),
									10,
									Deporte.FUTBOL);
		
		act2 = new ActividadSemanal(DiaDeLaSemana.MIERCOLES, 
				LocalTime.of(14, 25, 0),
				5,
				Deporte.BASKET);

		act3 = new ActividadSemanal(DiaDeLaSemana.VIERNES, 
				LocalTime.of(12, 20, 0),
				30,
				Deporte.BASKET);

		act4 = new ActividadSemanal(DiaDeLaSemana.SABADO, 
				LocalTime.of(11, 15, 0),
				20,
				Deporte.TENIS);

		act5 = new ActividadSemanal(DiaDeLaSemana.MARTES, 
				LocalTime.of(10, 10, 0),
				15,
				Deporte.FUTBOL);
		
		//Añadimos las actividades semanales a la secretaria
		secretaria.addActividad(act1);
		secretaria.addActividad(act2);
		secretaria.addActividad(act3);
		secretaria.addActividad(act4);
		secretaria.addActividad(act5);
		
	}
	
	
	@Test
	void testTodosFutbol() {

		//Lista de actividades esperada con los elementos act1 y act5
		List<ActividadSemanal> esperado = Arrays.asList(act1, act5);
		
		assertEquals(esperado,secretaria.todasDeFutbol());
	}
	
	@Test
	void testTodasDeComplejidadDos() {

		//Lista de actividades esperada con los elementos act1 y act5
		List<ActividadSemanal> esperado = Arrays.asList(act1,act2,act3,act5);
		
		assertEquals(esperado,secretaria.actividadesConComplejidad(2));
	}
	
	
	@Test
	void testHorasTotalesDeActividad() {

	
		assertEquals(80,secretaria.horasTotalesDeActividad());
	}
}
