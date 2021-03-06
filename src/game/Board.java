/**
 * 
 */
package game;

import java.util.ArrayList;

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
	 * Adding pawn 
	 * 
	 * @param x Vertical position
	 * @param y Horizontal position
	 * @param p Pawn added to the board
	 * 
	 * @return result
	 */
	public boolean adjPown(int x, int y, Pawn p) {

		if(x < 0 || x > 6)
			return false;
		if(y < 0 || y > 5)
			return false;
		if(board[x][y].getPawn() != null){
			return false;
		}
		/*
		 * We check out this square's neighbor
		 */
		ArrayList<Square> voisins = voisins(x,y);
		try {
			switch(p.toString()){
			
			case "Gazelle":
				/*
				 * If one of the neighbor is a lion, this token hides
				 */
				for(int i=0;i<voisins.size();i++){
					if(voisins.get(i).getPawn().toString()=="Lion"){
						p.seCache();
					}
				}
				break;
				
			case "Lion":
				for(int i=0;i<voisins.size();i++){
					if(voisins.get(i).getPawn().toString()=="Zebre"){
						voisins.get(i).getPawn().seCache();
					}
					
					if(voisins.get(i).getPawn().toString()=="Gazelle"){
						voisins.get(i).getPawn().fuite();
					}
				}
				break;
				
			case "Crocodile":
				ArrayList<Square> listeG = gazellesEchangeables(x,y);
				
				if(listeG.size()==0){ //S'il n'y a pas de gazelle a echanger, ne fait rien
					
				} else
					if(listeG.size()==1){ // S'il n'y a qu'une gazelle a echanger, on le fait
					board[x][y].adjPown(p);
					board[x][y].echanger(listeG.get(0));
					return true;
				} else { //Il y a plus d'une gazelle que l'on peut echanger, il faut demander au joueur laquelle
					
				}
				break;
				
			case "Zebre":
				for(int i=0;i<voisins.size();i++){
					if(voisins.get(i).getPawn().toString()=="Lion"){
						p.seCache();
					}
				}
				break;
				
			case "Elephant":
				break;
			}
			
			
			board[x][y].adjPown(p);
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}

	public ArrayList<Square> voisins(int x, int y){
		ArrayList<Square> tmp = new ArrayList<Square>();
		switch(x){
		case 0:
			tmp.add(board[x+1][y]);
			break;
		case 6:
			tmp.add(board[x-1][y]);
			break;
		default:
			tmp.add(board[x-1][y]);
			tmp.add(board[x+1][y]);
		}

		switch(y){
		case 0:
			tmp.add(board[x][y+1]);
			break;
		case 5:
			tmp.add(board[x][y-1]);
			break;
		default:
			tmp.add(board[x][y-1]);
			tmp.add(board[x][y+1]);
		}

		return tmp;
	}
	
	/**
	 * On utilise cette methode quand on veut poser un crocodile, pour savoir si l'on peut l'echanger de place avec une gazelle
	 * @param x
	 * @param y
	 * @return
	 */
	public ArrayList<Square> gazellesEchangeables(int x, int y){
		ArrayList<Square> voisins = voisins(x,y);
		ArrayList<Square> echangeable = new ArrayList<Square>();
		/*
		 * On regarde s'il y a des gazelles autour de la case cible
		 */
		for(int i=0;i<voisins.size();i++){
			if(voisins.get(i).getPawn().toString() == "Gazelle"){
				echangeable.add(voisins.get(i));
			}
		}
		/*
		 * Puis, on supprime les gazelles qui ne sont pas de l'autre cote de la riviere
		 */
		for(int i=0;i<echangeable.size();i++){
			if(board[x][y].getSector()==echangeable.get(i).getSector()){
				echangeable.remove(i);
			}
		}
		return echangeable;
	}
	
	
}