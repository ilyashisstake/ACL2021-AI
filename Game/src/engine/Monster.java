package engine;

public class Monster {
	private int X;
	private int Y;
	private int direction;   // 1:haut, 2:bas, 3:droite, 4:gauche, 0 pour un fantome 
	private int vitesse;
	
	public Monster(int X, int Y,int direction){
		this.X=X;
		this.Y=Y;
		this.direction=direction;
		if (this.direction == 0) {
			this.vitesse = 3;
		}
		else {
			this.vitesse = 8;
		}
	}
	
	public void setX(int X) {
		this.X=X;
	}

	public void setY(int Y) {
		this.Y=Y;
	}
	
	public void setDirection(int direction) {
		this.direction=direction;
	}

	public int getX() {
		return X;	
	}
	
	public int getY() {
		return Y;	
	}
	
	public int getDirection() {
		return direction;
		
	}
	public int getvitesse() {
		return vitesse;
	}
}