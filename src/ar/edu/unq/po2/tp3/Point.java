package ar.edu.unq.po2.tp3;

public class Point {

	//Atributos
	private int x;
	private int y;
	
	//Metodos
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	
	public void moverA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point sumarPuntoCon(Point punto1, Point punto2) {
		
		return new Point(punto1.getX() + punto2.getX(), punto1.getY() + punto2.getY());
		
	}
	
	//Getters and Setters
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	
	
}
