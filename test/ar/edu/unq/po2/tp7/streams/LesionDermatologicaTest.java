package ar.edu.unq.po2.tp7.streams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LesionDermatologicaTest {
	
	public LesionDermatologica lesionRoja;
	public LesionDermatologica lesionGris;
	public LesionDermatologica lesionAmarillo;
	public LesionDermatologica lesionMiel;

	@BeforeEach
	void setUp() throws Exception {
		
		 lesionRoja 	= LesionDermatologica.ROJO;
		 lesionGris 	= LesionDermatologica.GRIS;
		 lesionAmarillo = LesionDermatologica.AMARILLO;
		 lesionMiel     = LesionDermatologica.MIEL;
		
	}

	@Test
	void testSiguienteDeRojoEsMiel() {
		assertEquals(LesionDermatologica.MIEL, lesionRoja.siguiente());
	}
	
	@Test
	void testSiguienteDeGrisEsRojo() {
		assertEquals(LesionDermatologica.ROJO, lesionGris.siguiente());
	}
	
	@Test
	void testSiguienteDeAmarilloEsGris() {
		assertEquals(LesionDermatologica.GRIS, lesionAmarillo.siguiente());
	}
	
	@Test
	void testSiguienteDeMielEsAmarillo() {
		assertEquals(LesionDermatologica.AMARILLO, lesionMiel.siguiente());
	}
	
	
	
}
