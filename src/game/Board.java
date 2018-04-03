/**
 * 
 */
package game;

import pawn.Pawn;

/**
 * @author Adrien
 *
 */
public class Board {

	
	/**
	 * Board of game
	 */
	private Square[][] board;
	

	/**
	 * Adding pawn 
	 * 
	 * @param x Vertical position
	 * @param y Horizontal position
	 * @param p Pawn added to the board
	 * 
	 * @return result
	 */
	public boolean adjPown(int x, int y, Pawn p) {
		
		if(x < 0 || x > 5)
			return false;
		if(y < 0 || y > 6)
			return false;
		try {
			board[x][y].adjPown(p);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
}