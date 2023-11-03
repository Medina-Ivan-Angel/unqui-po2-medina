package ar.edu.unq.po2.tp9.Composite;

//ROL: Leaf (hoja)
public class Caballero implements Unidad{
	
	//Atributos
	private int posX;
	private int posY;
	
	//Constructor
	public Caballero(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	
	//Metodo

	@Override
	public void caminarA(int x, int y) {
		
	while(!this.estoyEnPosicion(x,y)) {
				
			this.moverseEnZigZag();
		}
		
	}
	
	private boolean estoyEnPosicion(int x, int y) {
		return (this.posX == x) && (this.posY == y);
	}

	public void moverseEnZigZag() {
		System.out.println("Yendo en zig-zag");
	}
	
	
	//Getters and Setters

}
