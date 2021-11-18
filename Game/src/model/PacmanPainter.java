package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import engine.Case;
import engine.GamePainter;
import engine.Heros;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * afficheur graphique pour le game
 * 
 */
public class PacmanPainter implements GamePainter {

	/**
	 * la taille des cases
	 */
	protected static final int WIDTH = 400;
	protected static final int HEIGHT = 400;
	

	/**
	 * appelle constructeur parent
	 * 
	 * @param game
	 *            le jeutest a afficher
	 */
	public PacmanPainter() {
	}

	/**
	 * methode  redefinie de Afficheur retourne une image du jeu
	 */
	@Override
	public void draw(BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		crayon.setColor(Color.gray);
		for(int k=0;k<WIDTH;k=k+10) {
		crayon.fillRect(k,0,20,20);
		crayon.fillRect(k,HEIGHT-20,20,20);
		crayon.fillRect(WIDTH-20,k,20,20);
		crayon.fillRect(0,k,20,20);}
		for(int k=0;k<PacmanGame.cases.getLabyrinthe().length;k++) {
			crayon.fillRect(PacmanGame.cases.getLabyrinthe()[k][0],PacmanGame.cases.getLabyrinthe()[k][1],20,20);
		}
		crayon.setColor(Color.cyan);
		for(int k=0;k<PacmanGame.cases.getSortie().length;k++) {
			crayon.fillRect(PacmanGame.cases.getSortie()[k][0],PacmanGame.cases.getSortie()[k][1],20,20);}
		crayon.setColor(Color.black);
		for(int k=0;k<PacmanGame.cases.getPortail().length;k++) {
			crayon.fillRect(PacmanGame.cases.getPortail()[k][0],PacmanGame.cases.getPortail()[k][1],20,20);}
		crayon.setColor(Color.blue);
		crayon.fillOval(PacmanGame.heros.getX(),PacmanGame.heros.getY(),20,20);
		
	}

	@Override
	public  int getWidth() {
		return WIDTH;
	}

	@Override
	public  int getHeight() {
		return HEIGHT;
	}

}
