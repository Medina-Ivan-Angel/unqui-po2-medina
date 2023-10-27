package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Empresa.EmpleadoPasante;
import ar.edu.unq.po2.tp8.Empresa.EmpleadoPlanta;
import ar.edu.unq.po2.tp8.Empresa.EmpleadoTemporario;
import ar.edu.unq.po2.tp8.Empresa.Empresa;

class EmpresaLiquidandoSueldoTest {

	Empresa empresa;
	EmpleadoTemporario eTemporario;
	EmpleadoPasante ePasante;
	EmpleadoPlanta  ePlanta;
	
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
		//Instanciamos la empresa
		empresa = new Empresa();
		
		//Instanciamos los empleados
		eTemporario = new EmpleadoTemporario(1000, 5, 10, true, false);
		ePasante    = new EmpleadoPasante(10, 40);
		ePlanta		= new EmpleadoPlanta(3000, 1);
		
		//Añadimos los empleados a la empresa
		empresa.addEmpleado(eTemporario);
		empresa.addEmpleado(ePasante);
		empresa.addEmpleado(ePlanta);
		
		//Liquidamos los sueldos correspondientes a cada empleado
		empresa.liquidarSueldos();
	}

	@Test
	void testEmpleadoTemporarioSueldoBruto() {
		assertEquals(1000.5,eTemporario.getSueldoBruto());
	}
	
	@Test
	void testEmpleadoPasanteSueldoBruto() {
		assertEquals(348,ePasante.getSueldoBruto());
	}

	@Test
	void testEmpleadoPlantaSueldoBruto() {
		assertEquals(2740.5,ePlanta.getSueldoBruto());
	}

}
