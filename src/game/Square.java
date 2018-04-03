/**
 * 
 */
package game;

import pawn.Pawn;

/**
 * @author Adrien
 *
 */
public class Square {
	
	private int sector;
	private Pawn pawn;

	public void adjPown(Pawn p) {
		this.pawn = p;
	}

}
