package unq;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;
import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {
	
	private ArrayList<Integer> listaDeEnteros = new ArrayList<Integer>();
	private Multioperador m;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		listaDeEnteros.add(1); //[0]
		listaDeEnteros.add(2); //[1]
		listaDeEnteros.add(3); //[2]
		listaDeEnteros.add(4); //[3]
		listaDeEnteros.add(5); //[4]
		
		m = new Multioperador();
	}
	
	@Test
	void testSumar() {
		
		int amount = m.sumarTodos(listaDeEnteros);
		
		assertEquals(15, amount);
	}
	
	@Test
	void testRestar() {
		
		int amount = m.restarTodos(listaDeEnteros);
		
		assertEquals(-13, amount);
	}
	
	@Test
	void testMultiplicar() {
		
		int amount = m.multiplicarTodos(listaDeEnteros);
		
		assertEquals(120, amount);
	}
}
