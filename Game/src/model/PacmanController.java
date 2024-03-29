package model;

import java.awt.event.KeyEvent;

import engine.Cmd;
import engine.GameController;
import engine.Heros;


/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * controleur de type KeyListener
 * 
 */
public class PacmanController implements GameController {

	/**
	 * commande en cours
	 *
	 */
	private Cmd commandeEnCours;
	
	
	
	/**
	 * construction du controleur par defaut le controleur n'a pas de commande
	 */
	public PacmanController() {
		this.commandeEnCours = Cmd.IDLE;
	}

	/**
	 * quand on demande les commandes, le controleur retourne la commande en
	 * cours
	 * 
	 * @return commande faite par le joueur
	 */
	public Cmd getCommand() {
		return this.commandeEnCours;
	}

	@Override
	/**
	 * met a jour les commandes en fonctions des touches appuyees
	 */
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyChar()) {
		// si on appuie sur 'q',commande joueur est gauche
		case 'q':
			this.commandeEnCours = Cmd.LEFT;
			break;
		case 'z':
			this.commandeEnCours = Cmd.UP;
			break;
		case's':
			this.commandeEnCours = Cmd.DOWN;
			break;
		case'd':
			this.commandeEnCours = Cmd.RIGHT;
			break;
		case 'Q':
			this.commandeEnCours = Cmd.LEFT;
			break;
		case 'Z':
			this.commandeEnCours = Cmd.UP;
			break;
		case'S':
			this.commandeEnCours = Cmd.DOWN;
			break;
		case'D':
			this.commandeEnCours = Cmd.RIGHT;
			break;
		case'R':
			this.commandeEnCours = Cmd.ATQD;
			break;
		case'r':
			this.commandeEnCours = Cmd.ATQD;
			break;
		case'A':
			this.commandeEnCours = Cmd.ATQH;
			break;
		case'a':
			this.commandeEnCours = Cmd.ATQH;
			break;
		case'e':
			this.commandeEnCours = Cmd.ATQG;
			break;
		case'E':
			this.commandeEnCours = Cmd.ATQG;
			break;
		case't':
			this.commandeEnCours = Cmd.ATQB;
			break;
		case'T':
			this.commandeEnCours = Cmd.ATQB;
			break;
		}

	}

	@Override
	/**
	 * met a jour les commandes quand le joueur relache une touche
	 */
	public void keyReleased(KeyEvent e) {
		this.commandeEnCours = Cmd.IDLE;
	}

	@Override
	/**
	 * ne fait rien
	 */
	public void keyTyped(KeyEvent e) {

	}

}
