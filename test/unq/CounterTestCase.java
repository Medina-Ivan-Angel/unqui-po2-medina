package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testEvenNumbers() {
		// Getting the even occurrences
		int amount = counter.getEvenOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
	/**
	 * Verifica la cantidad de Impares
	 */
	@Test
	public void testOddNumbers() {
		// Getting the odd occurrences
		int amount = counter.getOddOcurrences();
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	
	/**
	 * Verifica la cantidad de multiplos
	 */
	@Test
	public void testMultiples() {
		// Getting the multiple occurrences
		int amount = counter.getMultipleOcurrences(3);
		// I check the amount is the expected one
		assertEquals(amount, 2);
	}
	
	
	/**
	 * 3) Verifica el numero mas alto entre 0 y 1000 que sea multiplo de 3 y 9 (999)
	 */
	@Test
	public void testMaximoMultiplo() {
		// Getting the multiple occurrences
		int amount = counter.maximoMultiploEntre(3, 9);
		// I check the amount is the expected one
		assertEquals(999 , amount);
	}
	
	
	
	
	
}