package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {

	//Constructor
	public Cuadrado(Point verticeInferiorIzquierdo, int lado) {
		super(verticeInferiorIzquierdo, new Point(verticeInferiorIzquierdo.getX() + lado,
												  verticeInferiorIzquierdo.getY() + lado));
	
	}

}
