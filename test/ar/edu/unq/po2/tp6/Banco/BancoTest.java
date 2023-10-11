package ar.edu.unq.po2.tp6.Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {

	//Banco
	Banco banco;
	
	//Clientes
	Cliente c1;
	Cliente c2;
	Cliente c3;
	Cliente c4;
	Cliente c5;
	Cliente c6;
	
	//Propiedades Inmobiliarias
	PropiedadInmobiliaria prop1;
	PropiedadInmobiliaria prop2;
	
	//Solicitudes
	SolicitudHipotecario sh1;
	SolicitudHipotecario sh2;
	SolicitudPersonal sp1;
	SolicitudPersonal sp2;
	SolicitudPersonal sp3;
	SolicitudPersonal sp4;
	
	
	
	@BeforeEach
	public void setUp() {
		
		
		//Clientes
		c1 = new Cliente("Ivan", "Medina", "5438", 32, 1000, 10000);
		c2 = new Cliente("Dario","Perez", "1438", 35, 41000, 20000);
		c3 = new Cliente("Marcos", "Gonzales", "5333", 50, 31000, 30000);
		c4 = new Cliente("Cynthia", "Muller", "5111", 80, 1000, 40000);
		c5 = new Cliente("Tamara", "Smith", "2238", 90, 1000, 50000);
		c6 = new Cliente("Maia", "Gutierrez", "3468", 20, 1000, 60000);
		
		//Propiedades Inmobiliarias
		prop1 = new PropiedadInmobiliaria("Barata", "1234", 5000);
		prop2 = new PropiedadInmobiliaria("Cara", "2346", 100000);
		
		
		//Solicitudes
		sh1 = new SolicitudHipotecario(c1, 0, 0, prop1);
		sh2 = new SolicitudHipotecario(c2, 0, 0, prop2);
		
		sp1 = new SolicitudPersonal(c3, 1000, 3);
		sp2 = new SolicitudPersonal(c4, 30000, 5);
		sp3 = new SolicitudPersonal(c5, 90000, 10);
		sp4 = new SolicitudPersonal(c6, 200000, 12);
		
		//Banco
		banco = new Banco();
		
		//Añadimos los clientes
		banco.addCliente(c1);
		banco.addCliente(c2);
		banco.addCliente(c3);
		banco.addCliente(c4);
		banco.addCliente(c5);
		banco.addCliente(c6);
		
		
		//Hacemos que cada cliente solicite un credito
		c1.solicitarCredito(banco, sh1);
		c2.solicitarCredito(banco, sh2);
		c3.solicitarCredito(banco, sp1);
		c4.solicitarCredito(banco, sp2);
		c5.solicitarCredito(banco, sp3);
		c6.solicitarCredito(banco, sp4);
	}
	
	@Test
	void testHaySeisSolicitudesAñadidas() {
		assertEquals(6, banco.getSolicitudes().size());
	}
	
	@Test
	void testTotalClientes() {
		assertEquals(6, banco.getClientes().size());
	}
	
	
	@Test
	void testSolicitudHipotecario1Valida() {
		assertEquals(false, sh1.getEsValido());
	}
	

	@Test
	void testSolicitudHipotecario2Valida() {
		assertEquals(false,sh2.getEsValido());
	}
	
	@Test
	void testSolicitudPersonal1Valida() {
		assertEquals(true,sp1.getEsValido());
	}
	
	@Test
	void testSolicitudPersonal2Valida() {
		assertEquals(false,sp2.getEsValido());
	}
	
	@Test
	void testSolicitudPersonal3Valida() {
		assertEquals(false,sp3.getEsValido());
	}
	
	@Test
	void testSolicitudPersonal4Valida() {
		assertEquals(false,sp4.getEsValido());
	}
	
	
	
	
	
	@Test
	void testMontoTotalAPagar() {
		assertEquals(1000, banco.getMontoTotalAPagar());
	}

}
