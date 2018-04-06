/**
 * 
 */
package game;

import pawn.Pawn;


/**
 * @author Adrien
 */
public class Board {
	
	/**
	 * Board of game
	 */
	private Square[][] board;
	
	
	/**
	 * Initialization of all the square
	 */
	public Board() {
		this.board = new Square[5][6];
		
		board[0][0] = new Square(0);
		board[0][1] = new Square(2);
		board[0][2] = new Square(3);
		board[0][3] = new Square(3);
		board[0][4] = new Square(3);
		board[0][5] = new Square(3);
		board[1][0] = new Square(0);
		board[1][1] = new Square(2);
		board[1][2] = new Square(2);
		board[1][3] = new Square(3);
		board[1][4] = new Square(4);
		board[1][5] = new Square(4);
		board[2][0] = new Square(0);
		board[2][1] = new Square(0);
		board[2][2] = new Square(2);
		board[2][3] = new Square(3);
		board[2][4] = new Square(3);
		board[2][5] = new Square(4);
		board[3][0] = new Square(1);
		board[3][1] = new Square(0);
		board[3][2] = new Square(2);
		board[3][3] = new Square(2);
		board[3][4] = new Square(2);
		board[3][5] = new Square(5);
		board[4][0] = new Square(1);
		board[4][1] = new Square(1);
		board[4][2] = new Square(5);
		board[4][3] = new Square(5);
		board[4][4] = new Square(5);
		board[4][5] = new Square(5);
	}
	

	/**
	 * Adding pawn on board
	 * 
	 * @param x Vertical position
	 * @param y Horizontal position
	 * @param p Pawn added to the board
	 * 
	 * @return result
	 */
	public boolean adjPown(int x, int y, Pawn p) {
		
		// Coordinate normalization
		if(x < 0 || x > 5)
			return false;
		if(y < 0 || y > 6)
			return false;
		
		// adding the pawn
		return board[x][y].adjPown(p);
	}
}