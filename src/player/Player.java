/**
 * 
 */
package player;

import java.util.ArrayList;
import pawn.*;


/**
 * @author Adrien
 *
 */
public class Player {

	private String name;
	private ArrayList<Pawn> pawnBox;
	private int score;
	
	
	public Player(String name) {
		this.name = name;
		
		/*
		 * Giving player's pawn 
		 */
		pawnBox.add(new Gazelle());
		pawnBox.add(new Gazelle());
		pawnBox.add(new Gazelle());
		pawnBox.add(new Gazelle());
		pawnBox.add(new Gazelle());
		pawnBox.add(new Gazelle());

		pawnBox.add(new Zebre());
		pawnBox.add(new Zebre());
		pawnBox.add(new Zebre());
		pawnBox.add(new Zebre());
		pawnBox.add(new Zebre());

		pawnBox.add(new Elephant());

		pawnBox.add(new Lion());
	
		pawnBox.add(new Crocodile());
		pawnBox.add(new Crocodile());
		
	}
}
