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

	public Square(int sectore) {
		this.sector = sector;
	}

	/**
	 * Adding pawn on square
	 * 
	 * @param p
	 * @return boolean
	 */
	public boolean adjPown(Pawn p) {
		if(this.pawn == null) {
			this.pawn = p;
			return true;
		}else {
			return false;
		}
	}

}