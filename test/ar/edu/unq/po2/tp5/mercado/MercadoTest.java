package ar.edu.unq.po2.tp5.mercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Cliente;
import ar.edu.unq.po2.tp5.Mercado;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoTradicional;

class MercadoTest {

	//Atributos
	private Mercado mercado;
	private Caja caja;
	private Cliente cliente1;
	private Cliente cliente2;
	private ProductoTradicional Arroz;
	private ProductoTradicional Fideo;
	private ProductoTradicional Aceite;
	private ProductoCooperativa Maizena;
	private ProductoCooperativa Soja;
	private ProductoCooperativa Jugo;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Inicializamos los productos
		Arroz   = new ProductoTradicional(10);
		Fideo   = new ProductoTradicional(10);
		Aceite  = new ProductoTradicional(10);
		Maizena = new ProductoCooperativa(100);
		Soja 	= new ProductoCooperativa(100);
		Jugo 	= new ProductoCooperativa(100);
		
		// Preparamos el mercado, añadimos los productos 
		// al stock menos el jugo.
		mercado = new Mercado();
		
		mercado.agregar(Arroz);
		mercado.agregar(Fideo);
		mercado.agregar(Aceite);
		mercado.agregar(Maizena);
		mercado.agregar(Soja);
		mercado.agregar(Fideo);
		
		//Añadimos la caja
		caja = new Caja(mercado);
		
		//Creamos el cliente con la caja correspondiente
		cliente1 = new Cliente(caja);
		
		
		//Agregamos los productos a la lista de compras
		//del cliente1
		cliente1.agregar(Aceite);
		cliente1.agregar(Soja);
		cliente1.agregar(Jugo);
		cliente1.agregar(Maizena);
		
		
		//Creamos el cliente con la caja correspondiente
		cliente2 = new Cliente(caja);
				
				
		//Agregamos los productos a la lista de compras
		//del cliente1
		cliente2.agregar(Arroz);
		cliente2.agregar(Soja);
		cliente2.agregar(Fideo);
		cliente2.agregar(Fideo);
		cliente2.agregar(Fideo);
		cliente2.agregar(Fideo);
		
	}
	
	
	@Test
	void testCliente1() {
		cliente1.registrarProductos();
		assertEquals(190,cliente1.getMontoTotalAPagar());
	}
	
	void testCliente2() {
		cliente2.registrarProductos();
		assertEquals(110,cliente2.getMontoTotalAPagar());
	}
	
	void testStockMercado() {
		cliente2.registrarProductos();
		assertTrue(mercado.getStock().contains(Fideo));
	}
}
