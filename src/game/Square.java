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
	
	public int getSector(){
		return this.sector;
	}

	public Square(int sector){
		this.sector = sector;
	}
	
	public void adjPown(Pawn p) {
		this.pawn = p;
	}
	
	public void echanger(Square s){
		Pawn tmp = this.pawn;
		this.pawn = s.pawn;
		s.pawn = tmp;
	}
}