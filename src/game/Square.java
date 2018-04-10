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
	private Pawn pawn = null;
	
	public Pawn getPawn(){
		return this.pawn;
	}

	public Square(int sector){
		this.sector = sector;
	}
	
	public void adjPown(Pawn p) {
		this.pawn = p;
	}
}