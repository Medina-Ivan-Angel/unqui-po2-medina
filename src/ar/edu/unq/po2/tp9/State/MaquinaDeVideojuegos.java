package ar.edu.unq.po2.tp9.State;

public class MaquinaDeVideojuegos {
	
	//Atributos
	
	private int fichas;
	private State estadoJuego;

	//CONSTRUCTOR
	
	public MaquinaDeVideojuegos() {
		
		this.setEstadoJuego(new InitialState());
		
	}
	
	//Metodos
	public void presionarBotonInicio() {
		this.estadoJuego.mensaje();
	}
	
	public void ponerFicha() {
		
		this.fichas++;
		
		if(this.fichas == 1) {
			this.setEstadoJuego(new SinglePlayerState());
		}else if(this.fichas == 2){
			this.setEstadoJuego(new MultiplayerState());
		}else {
			this.terminarJuego(); // Queda raro esto aca, no deberia "terminar" el juego por poner 3 fichas pero la consigna no aclara.
		}
		
	}
	
	public void terminarJuego() {
		this.setEstadoJuego(new InitialState());
		this.fichas = 0;
	}
	
	//Getters and setters
	public int getFichas() {
		return fichas;
	}


	public State getEstadoJuego() {
		return estadoJuego;
	}

	public void setEstadoJuego(State estadoJuego) {
		this.estadoJuego = estadoJuego;
	}
	
	
	
}
