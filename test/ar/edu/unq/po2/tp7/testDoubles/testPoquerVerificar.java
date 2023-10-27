package ar.edu.unq.po2.tp7.testDoubles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*; //IMPORTAR SIEMPRE QUE USEMOS MOCKITO MANUALMENTE.

class testPoquerVerificar {

	PokerStatus ps;
	PokerStatus mps;
	@BeforeEach
	public void setUp() throws Exception{	//Esta funcion es el SETUP
		
		ps = new PokerStatus();
		

	}
	
	//Poquer, Color, Trio o Nada
	/*
	@Test
	void testVerificarHayColor() {  
		
		//5 Cartas del mismo palo hacen Color
		assertEquals("Color", ps.verificar("1T","2T","3T","4T","5T")); //EXERCISE Y VERIFY
	}*/
	
	//Aqui ocurre el teardown, el jUnit vuelve a reiniciar todos los valores llamando a setUp()
	
	
	
	@Test
	void testVerificarHayTrio() {  
		//Tres cartas con el mismo numero hacen Trio
		assertEquals("Trio", ps.verificar("2D","2P","K","2T","1D")); //EXERCISE Y VERIFY
	}
	//Aqui ocurre el teardown, el jUnit vuelve a reiniciar todos los valores llamando a setUp()
	
	
	@Test
	void testVerificarPoquerCon4Reyes() {  
		
		//4 reyes hacen un poquer
		assertEquals("Poquer", ps.verificar("K","K","K","K","1D")); //EXERCISE Y VERIFY
	}
	//Aqui ocurre el teardown, el jUnit vuelve a reiniciar todos los valores llamando a setUp()
	
	@Test
	void testVerificarPoquerCon4Ases() {
		
		//4 Ases hacen un poquer
		assertEquals("Poquer", ps.verificar("1D","1P","1T","K","1C")); //EXERCISE Y VERIFY
	}
	//Aqui ocurre el teardown, el jUnit vuelve a reiniciar todos los valores llamando a setUp()
	
	@Test
	void testVerificarNoHayPoquer() {
		
		//4 Ases hacen un poquer
		assertEquals("Nada", ps.verificar("3D","5P","9T","K","1C")); //EXERCISE Y VERIFY
	}
	//Aqui ocurre el teardown, el jUnit vuelve a reiniciar todos los valores llamando a setUp()
	
	
}
