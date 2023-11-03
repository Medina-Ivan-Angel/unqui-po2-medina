package ar.edu.unq.po2.tp9.State;

public class SinglePlayerState implements State{

	@Override
	public void mensaje() {

		System.out.println("Singleplayer seleccionado");
	}
	
	//Necesito sobreescribir el equals para que funcione el assertEquals del test
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
	       return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	       return false;
	    }
	    SinglePlayerState other = (SinglePlayerState) obj;
	    // Compara aquí los valores relevantes para la igualdad
	    // Por ejemplo:
	    // return this.algunaPropiedad.equals(other.algunaPropiedad);
	    // Reemplaza "algunaPropiedad" por la propiedad que quieras comparar
	    return true; // Cambia esto con la lógica de comparación adecuada
	    }

}
