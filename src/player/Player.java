package player;
import java.util.ArrayList;

import pawn.*;

public class Player {

	private String name;
	private ArrayList<Pawn> pawnBox;
	private int score;
	private String couleur;
	
	
	public Player(String name, String couleur) {
		this.name = name;
		this.couleur = couleur;
		
		/*
		 * Giving player's pawn 
		 */
		pawnBox.add(new Gazelle(couleur));
		pawnBox.add(new Gazelle(couleur));
		pawnBox.add(new Gazelle(couleur));
		pawnBox.add(new Gazelle(couleur));
		pawnBox.add(new Gazelle(couleur));
		pawnBox.add(new Gazelle(couleur));

		pawnBox.add(new Zebre(couleur));
		pawnBox.add(new Zebre(couleur));
		pawnBox.add(new Zebre(couleur));
		pawnBox.add(new Zebre(couleur));
		pawnBox.add(new Zebre(couleur));

		pawnBox.add(new Elephant(couleur));

		pawnBox.add(new Lion(couleur));
	
		pawnBox.add(new Crocodile(couleur));
		pawnBox.add(new Crocodile(couleur));
	}
}