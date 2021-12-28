package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import engine.Case;
import engine.Cmd;
import engine.Game;
import engine.Heros;
import engine.Timer;
import engine.Monster;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 *         Version avec personnage qui peut se deplacer. A completer dans les
 *         versions suivantes.
 * 
 */
public class PacmanGame implements Game {

	/**
	 * constructeur avec fichier source pour le help
	 * 
	 */
	
    public static Heros heros = new Heros(20,20,3);
	
	public static Case cases =new Case("plateau.txt");
	
	public static Timer timer=new Timer(20);
	
	public static List<Monster> monstres;
	
	public PacmanGame(String source, String fichier) {
		BufferedReader helpReader;
		try {
			helpReader = new BufferedReader(new FileReader(source));
			String ligne;
			while ((ligne = helpReader.readLine()) != null) {
				System.out.println(ligne);
			}
			helpReader.close();
		} catch (IOException e) {
			System.out.println("Help not available");
		}
		BufferedReader helpReader1;
		monstres= new ArrayList<Monster>();
		try {
			helpReader1 = new BufferedReader(new FileReader(fichier));
			String ligne;
			int j=0;
			while ((ligne = helpReader1.readLine()) != null) {
				String[] lignes=ligne.split(" ");
				for (int i = 0; i < lignes.length; i++) {
					if(lignes[i].equals("0")) {
						Monster monster = new Monster(i*20,j*20,0);
						monstres.add(monster);
					}
					if(lignes[i].equals("1")) {
						Monster monster = new Monster(i*20,j*20,1);
						monstres.add(monster);
					}
					if(lignes[i].equals("2")) {
						Monster monster = new Monster(i*20,j*20,2);
						monstres.add(monster);
					}
					if(lignes[i].equals("3")) {
						Monster monster = new Monster(i*20,j*20,3);
						monstres.add(monster);
					}
					if(lignes[i].equals("4")) {
						Monster monster = new Monster(i*20,j*20,4);
						monstres.add(monster);
					}
					if(lignes[i].equals("5")) {
						Monster monster = new Monster(i*20,j*20,5);
						monstres.add(monster);
					}
					if(lignes[i].equals("6")) {
						Monster monster = new Monster(i*20,j*20,5);
						monstres.add(monster);
					}
					if(lignes[i].equals("7")) {
						Monster monster = new Monster(i*20,j*20,5);
						monstres.add(monster);
					}
					if(lignes[i].equals("8")) {
						Monster monster = new Monster(i*20,j*20,5);
						monstres.add(monster);
					}
				}
				j=j+1;
			}
			helpReader1.close();
		} catch (IOException e) {
			System.out.println("Plateau non valide !!!");
		
	}
	}

	/**
	 * faire evoluer le jeu suite a une commande
	 * 
	 * @param commande
	 */
	
	public boolean check(Cmd commande,int x,int y) {
	switch (commande) {	
	case RIGHT:
		if (x+40<PacmanPainter.WIDTH) {
			if (contient(this.cases.getLabyrinthe(), x+20, y)) {
				return false;}
			else {return true;}}
		else {return false;}
	case UP:
		if (y>20) {
			if (contient(this.cases.getLabyrinthe(), x, y-20)) {
				return false;}
			else {return true;}}
		else {return false;}
		
	case DOWN:
		if (y+40<PacmanPainter.HEIGHT) {
			if (contient(this.cases.getLabyrinthe(), x, y+20)) {
				return false;}
			else {return true;}}
			
		else {return false;}
	case LEFT:
		if (x-20>0) {
			if (contient(this.cases.getLabyrinthe(), x-20, y)) {
				return false;}
			else {return true;}}
		else {return false;}
	
		}
		return false;
	}
	
	
	
	private static int getWIDHT() {
		// TODO Auto-generated method stub
		return 0;
	}
	
    public boolean contient(int [][]tab,int x,int y) {
    	int n=tab.length;
    	for(int i=0;i<n;i++) {
    		if (tab[i][0]==x && tab[i][1]==y) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public void teleportation() {
    	int x=this.heros.getX();
		int y=this.heros.getY();
    	if (contient(this.cases.getPortail(),x,y)){
    		this.heros.setX(20);
    		this.heros.setY(20);
    	}
    }
    
    public void bonus() {
    	int x=this.heros.getX();
		int y=this.heros.getY();
    	if (contient(this.cases.getBonus(),x,y)){
    		this.timer.incremente(10);
    		PacmanGame.cases.removeBonus(x,y);
    	}
    }
    
    public void malus() {
    	int x=this.heros.getX();
		int y=this.heros.getY();
    	if (contient(this.cases.getMalus(),x,y)){
    		this.timer.decremente(10);
    		PacmanGame.cases.removeMalus(x,y);
    	}
    }
    public void potion() {
    	int x=this.heros.getX();
		int y=this.heros.getY();
		if (contient(this.cases.getPotion(),x,y)) {
			cases.removePotion(x, y);
			timer.setTimeInvincible(timer.getTime_invinvible()+5);
		}
    }
    
    public void cles() {
    	int x=this.heros.getX();
		int y=this.heros.getY();
    	if (contient(this.cases.getCle(),x,y)){
    		PacmanGame.cases.removeCle(x,y);
    	}
    }
    
	@Override
	public void evolve(Cmd commande) {
		System.out.println("Execute "+commande);
		int deplacement=20;
		int x=this.heros.getX();
		int y=this.heros.getY();
		switch (commande) {
		// si on appuie sur 'q',commande joueur est gauche
		case RIGHT:
			if (check(commande,x,y)) {
			this.heros.setX(this.heros.getX()+deplacement);}
			break;
		case DOWN:
			if (check(commande,x,y)) {
			this.heros.setY(this.heros.getY()+deplacement);}
			break;
		case UP:
			if (check(commande,x,y)) {
			this.heros.setY(this.heros.getY()-deplacement);}
			break;
		case LEFT:
			if (check(commande,x,y)) {
			this.heros.setX(this.heros.getX()-deplacement);}
			break;
		
		}
		deplacementMonstre();
		teleportation();
		bonus();
		malus();
		cles();
		potion();
		if (timer.getTime_invinvible()<=0) {
		if (heros.getVie()>1) {
			if (estMort(x,y)) {
				heros.setVie(heros.getVie()-1);
				heros.setX(20);
				heros.setY(20);
			}}
		}
		else {timer.setTimeInvincible(timer.getTime_invinvible()-0.1);}
		this.timer.decremente(0.1);
	}

	public void deplacementMonstre() {
		int x0=PacmanGame.heros.getX();
		int y0=PacmanGame.heros.getY();
		for(int k=0;k<PacmanGame.monstres.size();k++) {
			int x=PacmanGame.monstres.get(k).getX();
			int y=PacmanGame.monstres.get(k).getY();
			int vitesse = PacmanGame.monstres.get(k).getvitesse();
			if (PacmanGame.monstres.get(k).getDirection()==1) {
				Cmd cmd=Cmd.UP;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setY(y-vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setY(y-vitesse);
					PacmanGame.monstres.get(k).setDirection(2);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==2) {
				Cmd cmd=Cmd.DOWN;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setY(y+vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setY(y-vitesse);
					PacmanGame.monstres.get(k).setDirection(1);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==3) {
				Cmd cmd=Cmd.RIGHT;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setX(x+vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setX(x-vitesse);
					PacmanGame.monstres.get(k).setDirection(4);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==4) {
				Cmd cmd=Cmd.LEFT;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setX(x-vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setX(x+vitesse);
					PacmanGame.monstres.get(k).setDirection(3);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==0) {
				List<Double> liste= new ArrayList<>();
				double d0=distance(x,y-vitesse,x0,y0);
				double d1=distance(x,y+vitesse,x0,y0);
				double d2=distance(x+vitesse,y,x0,y0);
				double d3=distance(x-vitesse,y,x0,y0);
				liste.add(d0);
				liste.add(d1);
				liste.add(d2);
				liste.add(d3);
				
				int indice= liste.indexOf(Collections.min(liste));
				if (indice==0) {
					PacmanGame.monstres.get(k).setY(y-vitesse);
				}
				if (indice==1) {
					PacmanGame.monstres.get(k).setY(y+vitesse);
				}
				if (indice==2) {
					PacmanGame.monstres.get(k).setX(x+vitesse);
				}
				if (indice==3) {
					PacmanGame.monstres.get(k).setX(x-vitesse);
				}
		
			}
			if (PacmanGame.monstres.get(k).getDirection()==5) {
				Cmd cmd=Cmd.UP;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setY(y-vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setX(x+vitesse);
					PacmanGame.monstres.get(k).setDirection(6);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==6) {
				Cmd cmd=Cmd.RIGHT;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setX(x+vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setY(y+vitesse);
					PacmanGame.monstres.get(k).setDirection(7);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==7) {
				Cmd cmd=Cmd.DOWN;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setY(y+vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setX(x-vitesse);
					PacmanGame.monstres.get(k).setDirection(8);
				}
			}
			if (PacmanGame.monstres.get(k).getDirection()==8) {
				Cmd cmd=Cmd.LEFT;
				if (check(cmd,x,y)){
					PacmanGame.monstres.get(k).setX(x-vitesse);
				}
				else {
					PacmanGame.monstres.get(k).setY(y-vitesse);
					PacmanGame.monstres.get(k).setDirection(5);
				}
			}
		}
	}
	
	public double distance(int x,int y,int x0,int y0) {
		double distance=Math.sqrt(Math.pow((x-x0),2)+Math.pow((y-y0),2));
		return distance;
	}
	
	public boolean estMort(int x,int y) {
		for(int k=0;k<PacmanGame.monstres.size();k++) {
			if (x==PacmanGame.monstres.get(k).getX() && y==PacmanGame.monstres.get(k).getY()) {
				return true;
			}
			if (x==PacmanGame.monstres.get(k).getX() && Math.abs(y-PacmanGame.monstres.get(k).getY())<=10){
				return true;
			}
			if (Math.abs(x-PacmanGame.monstres.get(k).getX())<=10 && y==PacmanGame.monstres.get(k).getY()){
				return true;
			}
			if (Math.abs(y-PacmanGame.monstres.get(k).getY())<=10 && Math.abs(x-PacmanGame.monstres.get(k).getX())<=10) {
				return true;
			}
		}
		return false;
	}
	/**
	 * verifier si le jeu est fini
	 */
	@Override
	public boolean isFinished() {
		int x=this.heros.getX();
		int y=this.heros.getY();
		if (PacmanGame.cases.getCle().length==0) {
			if (contient(this.cases.getSortie(),x,y)) {
				return true;
			}}
		if (this.timer.getTime()<=0) {
			return true;
		}
		if (timer.getTime_invinvible()<=0) {
		if (heros.getVie()==1) {
		if (estMort(x,y)) {
			heros.setVie(0);
			return true;
		}}}
		return false;
	}

}
