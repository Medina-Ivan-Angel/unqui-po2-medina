package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;



class PointTestCase {
	
	private Point p;
	private Point p1;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		p = new Point(5,5);
		p1 = new Point(1,1);
	}
	
	
	@Test
	void testMover() {
		
		p.moverA(3, 2);
		
		assertEquals(3, p.getX());
		assertEquals(2, p.getY());
		
	}
	
	@Test
	void testSumarPuntos() {
		
		Point puntoFinal = p.sumarPuntoCon(p, p1);;
		
		assertEquals(6, puntoFinal.getX());
		assertEquals(6, puntoFinal.getY());
		
	}
}
