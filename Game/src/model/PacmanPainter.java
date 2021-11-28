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
	protected static final int WIDTH = 540;
	protected static final int HEIGHT = 360;
	

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
		int taille=20;
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		crayon.setColor(Color.gray);
		for(int k=0;k<WIDTH;k=k+10) {
		crayon.fillRect(k,0,taille,taille);
		crayon.fillRect(k,HEIGHT-taille,taille,taille);
		crayon.fillRect(WIDTH-taille,k,taille,taille);
		crayon.fillRect(0,k,taille,taille);}
		for(int k=0;k<PacmanGame.cases.getLabyrinthe().length;k++) {
			crayon.fillRect(PacmanGame.cases.getLabyrinthe()[k][0],PacmanGame.cases.getLabyrinthe()[k][1],taille,taille);
		}
		if (PacmanGame.cases.getCle().length==0) {
			crayon.setColor(Color.cyan);
			for(int k=0;k<PacmanGame.cases.getSortie().length;k++) {
				crayon.fillRect(PacmanGame.cases.getSortie()[k][0],PacmanGame.cases.getSortie()[k][1],taille,taille);}}
		crayon.setColor(Color.black);
		for(int k=0;k<PacmanGame.cases.getPortail().length;k++) {
			crayon.fillRect(PacmanGame.cases.getPortail()[k][0],PacmanGame.cases.getPortail()[k][1],taille,taille);}
		crayon.setColor(Color.yellow);
		for(int k=0;k<PacmanGame.cases.getCle().length;k++) {
			crayon.fillOval(PacmanGame.cases.getCle()[k][0],PacmanGame.cases.getCle()[k][1],taille-8,taille-8);}
		crayon.setColor(Color.white);
		crayon.drawString(PacmanGame.timer.toString(), WIDTH/2 - 5, 15);
		crayon.setColor(Color.red);
		for(int k=0;k<PacmanGame.cases.getMalus().length;k++) {
			crayon.fillRect(PacmanGame.cases.getMalus()[k][0],PacmanGame.cases.getMalus()[k][1],taille,taille);}
		crayon.setColor(Color.green);
		for(int k=0;k<PacmanGame.cases.getBonus().length;k++) {
			crayon.fillRect(PacmanGame.cases.getBonus()[k][0],PacmanGame.cases.getBonus()[k][1],taille,taille);}
		crayon.setColor(Color.blue);
		crayon.fillOval(PacmanGame.heros.getX(),PacmanGame.heros.getY(),taille,taille);
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
