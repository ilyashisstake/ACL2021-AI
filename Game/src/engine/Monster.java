package engine;

public class Monster {
	private int X;
	private int Y;
	
	
	public Monster(int X, int Y){
		this.X=X;
		this.Y=Y;
	}
	
	public void setX(int X) {
		this.X=X;
	}

	public void setY(int Y) {
		this.Y=Y;
	}
	
	public int getX() {
		return X;	
	}
	
	public int getY() {
		return Y;	
	}

}