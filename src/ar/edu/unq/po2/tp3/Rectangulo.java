package ar.edu.unq.po2.tp3;

public class Rectangulo {

	//Atributos
	private Point verticeInferiorIzquierdo;
	private Point verticeSuperiorDerecho;
	
	//Constructores
	public Rectangulo(Point verticeInferiorIzquierdo, Point verticeSuperiorDerecho) {
		this.verticeInferiorIzquierdo = verticeInferiorIzquierdo;
		this.verticeSuperiorDerecho	  = verticeSuperiorDerecho;
	}
	
	//Metodos
	public int base() {
		return this.verticeSuperiorDerecho.getX() - this.verticeInferiorIzquierdo.getX();
	}
	
	public int altura() {
		return this.verticeSuperiorDerecho.getY() - this.verticeInferiorIzquierdo.getY();
	}
	
	public int area(){
		
		return this.base() * this.altura();
	}
	
	public int perimetro(){
		
		return 2 * this.base() + 2 * this.altura();
	}
	
	public boolean esHorizontal() {
		return this.base() > this.altura();
	}
	
	public boolean esVertical() {
		return this.altura() > this.base();
	}
	
	//Getters and Setters
	
	public Point getVerticeInferiorIzquierdo() {
		return verticeInferiorIzquierdo;
	}

	public Point getVerticeSuperiorDerecho() {
		return verticeSuperiorDerecho;
	}

	
	
	
}
