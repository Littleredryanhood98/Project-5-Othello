package Othello;

import java.util.Scanner;



public class Game { 
	
	private Board gameBoard;
	private char currentPlayer; 
	private boolean stop;
	private boolean cont;
	Scanner in;
	

	/**
	 * Don't forget the constructor and don't forget to add comments!
	 */
	public Game(String plrname, boolean Aiplr, String otrplrname, boolean Aiotrplr){
		gameBoard = new Board();
		Player plr1 = new Player(1,Aiplr,plrname);
		Player plr2 = new Player(2,Aiotrplr,otrplrname);
		stop = false;
		cont = false;
		in = new Scanner(System.in);

	}
	void gameLoop() {
		
	}
	

}
