package game;

import player.Player;
import config.Config;


public class Controler {

	private Board board;
	private Player Player1, Player2;
	
	public Controler() {
		this.board = new Board();
		
		System.out.println("Entrez le nom du joueur 1 : ");
		this.Player1 = new Player(Config.sc.nextLine());
		
		System.out.println("Entrez le nom du joueur 2 : ");
		this.Player2 = new Player(Config.sc.nextLine());
	}
	
}