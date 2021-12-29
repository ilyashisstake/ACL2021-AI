package engine;
import java.util.ArrayList;
import java.util.List;


public class Heros {
	private int X;
	private int Y;
	private int vie;
	private List<Munition> munition;
	
	
	public Heros(){
		this.X=0;
		this.Y=0;
		this.vie=3;
		this.munition=new ArrayList<Munition>();
	}
	
	public Heros(int X, int Y,int vie){
		this.X=X;
		this.Y=Y;
		this.vie=vie;
		this.munition=new ArrayList<Munition>();
	}
	
	public void addMunition() {
		this.munition.add(new Munition());
		this.munition.add(new Munition());
		this.munition.add(new Munition());
	}
	
	public int munitiondispo() {
		int a=0;
		for (int k=0;k<munition.size();k++) {
			if (munition.get(k).getDirection()==0) {
				a=a+1;
			}
		}
		return a;
	}
	public List<Munition> getMunition() {
		return munition;
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
