package ar.edu.unq.po2.tp4.trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.Trabajador;
import ar.edu.unq.po2.tp4.IngresoHorasExtras;

class TrabajadorTest {

	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingreso3;
	private IngresoHorasExtras horasExtras;
	
	@BeforeEach
	public void setUp() {
		ingreso1 	= new Ingreso("enero", "sueldo", 100);
		ingreso2 	= new Ingreso("febrero", "sueldo", 100);
		ingreso3 	= new Ingreso("marzo", "sueldo", 100);
		horasExtras = new IngresoHorasExtras("marzo", "horasExtras", 100, 10);
		
		trabajador  = new Trabajador();
		
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
		trabajador.agregarIngreso(horasExtras);
	}
	
	
	@Test
	void testTotalPercibido() {
		assertEquals(400, trabajador.getTotalPercibido());
	}

	@Test
	void testMontoImponible() {
		assertEquals(300, trabajador.getMontoImponible());
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(6, trabajador.getImpuestoAPagar());
	}
}
