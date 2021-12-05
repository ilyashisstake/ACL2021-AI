package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import engine.Case;
import engine.GamePainter;
import engine.Heros;
import engine.Monster;

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
		
		//affichage du fond
		crayon.setColor(Color.cyan.brighter());
		for(int i=0;i<WIDTH;i=i+20) {
			for(int j=0;j<WIDTH;j=j+20) {
				crayon.fillRect(i,j,taille,taille);
			}
		}
		
		
		
		
		
		
		
		
		
		//Affichage des murs
		/*for(int k=0;k<WIDTH;k=k+10) {
		crayon.fillRect(k,0,taille,taille);
		crayon.fillRect(k,HEIGHT-taille,taille,taille);
		crayon.fillRect(WIDTH-taille,k,taille,taille);
		crayon.fillRect(0,k,taille,taille);}*/
		
		try {
			BufferedImage image0= ImageIO.read(new File("Mur.png"));
			for(int k=0;k<PacmanGame.cases.getLabyrinthe().length;k++) {
				crayon.drawImage(image0,PacmanGame.cases.getLabyrinthe()[k][0],PacmanGame.cases.getLabyrinthe()[k][1],20,20,null);}
		}catch (IOException e) {
		for(int k=0;k<PacmanGame.cases.getLabyrinthe().length;k++) {
			crayon.fillRect(PacmanGame.cases.getLabyrinthe()[k][0],PacmanGame.cases.getLabyrinthe()[k][1],taille,taille);
			System.out.println("image mur non valide !!!");
		}}
		
		
		//Affichage case sortie
		if (PacmanGame.cases.getCle().length==0) {
			crayon.setColor(Color.yellow);
			for(int k=0;k<PacmanGame.cases.getSortie().length;k++) {
				crayon.fillRect(PacmanGame.cases.getSortie()[k][0],PacmanGame.cases.getSortie()[k][1],taille,taille);}}
		
		//Affichage cases portail 
		
		//version sans image
		/*crayon.setColor(Color.magenta);
		for(int k=0;k<PacmanGame.cases.getPortail().length;k++) {
			crayon.fillRect(PacmanGame.cases.getPortail()[k][0],PacmanGame.cases.getPortail()[k][1],taille,taille);}
			 */
		//version avec image
		
		try {
			BufferedImage image_portal= ImageIO.read(new File("portal.png"));
			for(int k=0;k<PacmanGame.cases.getPortail().length;k++) {
			crayon.drawImage(image_portal,PacmanGame.cases.getPortail()[k][0],PacmanGame.cases.getPortail()[k][1],25,30,null);}
		}catch (IOException e) {
			System.out.println("image portail non valide !!!");
			crayon.setColor(Color.magenta);
			for(int k=0;k<PacmanGame.cases.getPortail().length;k++) {
				crayon.fillRect(PacmanGame.cases.getPortail()[k][0],PacmanGame.cases.getPortail()[k][1],taille,taille);}
		}
		
		
		//Affichage clé
		try {
			BufferedImage image= ImageIO.read(new File("cle.png"));
			for(int k=0;k<PacmanGame.cases.getCle().length;k++) {
			crayon.drawImage(image,PacmanGame.cases.getCle()[k][0],PacmanGame.cases.getCle()[k][1],20,20,null);}
		}catch (IOException e) {
			System.out.println("image cle non valide !!!");
			crayon.setColor(Color.yellow);
			for(int k=0;k<PacmanGame.cases.getCle().length;k++) {
				crayon.fillOval(PacmanGame.cases.getCle()[k][0],PacmanGame.cases.getCle()[k][1],taille-8,taille-8);}
		}
		
		//Affichage timer
		crayon.setColor(Color.white);
		crayon.drawString(PacmanGame.timer.toString(), WIDTH/2 - 5, 15);
		
		
		//Affichage cases malus
		crayon.setColor(Color.red);
		for(int k=0;k<PacmanGame.cases.getMalus().length;k++) {
			crayon.fillRect(PacmanGame.cases.getMalus()[k][0],PacmanGame.cases.getMalus()[k][1],taille,taille);}
		
		//Affichage cases bonus
		crayon.setColor(Color.green);
		for(int k=0;k<PacmanGame.cases.getBonus().length;k++) {
			crayon.fillRect(PacmanGame.cases.getBonus()[k][0],PacmanGame.cases.getBonus()[k][1],taille,taille);}
		
		//Affichage heros
		crayon.setColor(Color.blue);
		crayon.fillOval(PacmanGame.heros.getX(),PacmanGame.heros.getY(),taille,taille);
		
		
		//Affichage monstre
		crayon.setColor(Color.black);
		for (int k=0; k<PacmanGame.monstres.size();k++) {
			Monster monstre = PacmanGame.monstres.get(k);
			if (monstre.getDirection() == 0) {
				crayon.setColor(Color.white);
			}
			crayon.fillOval(monstre.getX(),monstre.getY(),taille,taille);
			crayon.setColor(Color.black);
		}
		
		
	
		
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
