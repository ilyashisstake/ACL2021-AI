package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import engine.Cmd;
import engine.Game;

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
	public PacmanGame(String source) {
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
	}

	/**
	 * faire evoluer le jeu suite a une commande
	 * 
	 * @param commande
	 */
	
	public boolean check(Cmd commande) {
		int x=this.heros.getX();
		int y=this.heros.getY();
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
	return false;}
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
	@Override
	public void evolve(Cmd commande) {
		System.out.println("Execute "+commande);
		switch (commande) {
		// si on appuie sur 'q',commande joueur est gauche
		case RIGHT:
			if (check(commande)) {
			this.heros.setX(this.heros.getX()+20);}
			break;
		case DOWN:
			if (check(commande)) {
			this.heros.setY(this.heros.getY()+20);}
			break;
		case UP:
			if (check(commande)) {
			this.heros.setY(this.heros.getY()-20);}
			break;
		case LEFT:
			if (check(commande)) {
			this.heros.setX(this.heros.getX()-20);}
			break;
		
		}
		teleportation();
	}

	/**
	 * verifier si le jeu est fini
	 */
	@Override
	public boolean isFinished() {
		int x=this.heros.getX();
		int y=this.heros.getY();
		if (contient(this.cases.getSortie(),x,y)) {
			return true;
		}
		return false;
	}

}
