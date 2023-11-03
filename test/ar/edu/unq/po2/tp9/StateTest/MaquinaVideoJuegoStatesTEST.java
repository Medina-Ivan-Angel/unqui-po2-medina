package ar.edu.unq.po2.tp9.StateTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp9.State.InitialState;
import ar.edu.unq.po2.tp9.State.MaquinaDeVideojuegos;
import ar.edu.unq.po2.tp9.State.MultiplayerState;
import ar.edu.unq.po2.tp9.State.SinglePlayerState;

class MaquinaVideoJuegoStatesTEST {

	MaquinaDeVideojuegos maquina;
	InitialState initialState;
	SinglePlayerState single;
	MultiplayerState  multi;
	
	@BeforeEach
	void setUp() throws Exception {
		
		maquina = new MaquinaDeVideojuegos();
		
		initialState = new InitialState();
		single		 = new SinglePlayerState();
		multi		 = new MultiplayerState();
	}

	@Test
	void testBotonInicioSinFichas() {
		
		maquina.presionarBotonInicio();
		
		assertEquals(initialState, maquina.getEstadoJuego());
	}
	
	@Test
	void testBotonInicioConUnaFicha() {
		
		maquina.ponerFicha();
		maquina.presionarBotonInicio();
		
		assertEquals(single, maquina.getEstadoJuego());
	}
	
	@Test
	void testBotonInicioConDosFichas() {
		
		maquina.ponerFicha();
		maquina.ponerFicha();
		
		maquina.presionarBotonInicio();
		
		assertEquals(multi, maquina.getEstadoJuego());
	}
	
	@Test
	void testJuegoTerminado() {
		
		maquina.terminarJuego();
		
		assertEquals(initialState, maquina.getEstadoJuego());
	}
}
