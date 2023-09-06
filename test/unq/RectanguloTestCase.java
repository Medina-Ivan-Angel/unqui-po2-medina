package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;



class RectanguloTestCase {
	
	private Rectangulo r;
	private Point p1 = new Point(0,0);
	private Point p2 = new Point(5,3);
	private Cuadrado c;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		r = new Rectangulo(p1,p2);
		c = new Cuadrado(p1, 10);
	}
	
	
	
	@Test
	void testArea() {
		assertEquals(15,r.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(16,r.perimetro());
	}
	
	@Test
	void testEsVertical() {
		assertEquals(false,r.esVertical());
	}
	
	@Test
	void testEsHorizontal() {
		assertEquals(true,r.esHorizontal());
	}
	
	@Test
	void testEsCuadrado() {
		assertEquals(true,c.base() == c.altura());
	}
}
