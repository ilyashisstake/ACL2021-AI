package engine;

public class Heros {
	private int X;
	private int Y;
	private int vie;
	
	public Heros(){
		this.X=0;
		this.Y=0;
		this.vie=3;
	}
	
	public Heros(int X, int Y,int vie){
		this.X=X;
		this.Y=Y;
		this.vie=vie;
	}
	
	public void setX(int X) {
		this.X=X;
	}

	public void setY(int Y) {
		this.Y=Y;
	}
	public void setVie(int vie) {
		this.vie=vie;
	}
	public int getX() {
		return X;	
	}
	
	public int getY() {
		return Y;	
	}
	
	public int getVie() {
		return vie;	
	}
	
}
