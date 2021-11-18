package engine;

import java.util.*; 

public class Case {

	private int [][] labyrinthe; 
	
	private int [][] portail;
	
	private int [][] bonus;
	
	private int [][] malus;
	
	private int [][] sortie; 
	
	Case(){
		labyrinthe= new int [][]{{100,100},{120,100},{140,100},{160,100},{180,100},{200,100},{220,100},{100,120},{120,120},{140,120},{160,120},{180,120},{200,120},{220,120}};
		portail= new int [][] {{180,260}};
		sortie= new int [][] {{300,300}};
		bonus= new int [][] {{0,0}};
		malus= new int [][] {{0,0}};
	}
	
	public int [][] getLabyrinthe(){
		return labyrinthe;
	}
	public int [][] getSortie(){
		return sortie;
	}
	public int [][] getMalus(){
		return malus;
	}
	public int [][] getBonus(){
		return bonus;
	}
	public int [][] getPortail(){
		return portail;
	}
}
