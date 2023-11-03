package ar.edu.unq.po2.tp9.Composite;

//ROL: Leaf (hoja)
public class Ingeniero implements Unidad{
	
	//Atributos
	private int lajas;
	private int posX;
	private int posY;
	
	//CONSTRUCTOR
	public Ingeniero(int lajas, int posX, int posY) {
		this.lajas = lajas;
		this.posX  = posX;
		this.posY  = posY;
	}
	
	//Metodos
	
	
	@Override
	public void caminarA(int x , int y) {
		
		while(!this.estoyEnPosicion(x,y)) {
			
			if(this.lajas > 0) {
				this.caminarYPonerLaja(x,y);
			}else {
				this.caminarNormal(x,y);
			}
			
			
		}
		
		
	}
	
	public boolean estoyEnPosicion(int x, int y) {
		return (this.posX == x) && (this.posY == y);
	}
	
	public void caminarYPonerLaja(int x, int y) {
		this.caminarNormal(x, y);
		this.lajas--;
	}
	
	public void caminarNormal(int x, int y) {
		
		//Movimiento en X
		if(this.posX - x > 0) {
			this.posX--;
		}else if(this.posX - x < 0) {
			this.posX++;
		}
		
		//Movimiento en Y
		if(this.posY - y > 0) {
			this.posY--;
		}else if(this.posY- y < 0) {
			this.posY++;
		}
		
	}
	
	//Getters and setters
	
	public int getLajas() {
		return this.lajas;
	}


	
	
	
	
	
	
	
}
