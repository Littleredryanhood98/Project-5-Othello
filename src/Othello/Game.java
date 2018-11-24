package Othello;

import java.util.Scanner;



public class Game { 
	private Player plr1;
	private Player plr2;
	private Board gameBoard;
	private Player currentPlayer; 
	private boolean stop;
	private boolean cont;
	Scanner in;
	

	/**
	 * Don't forget the constructor and don't forget to add comments!
	 */
	public Game(String plrname, boolean Aiplr, String otrplrname, boolean Aiotrplr){
		gameBoard = new Board();
		plr1 = new Player('X',Aiplr,plrname);
		plr2 = new Player('O',Aiotrplr,otrplrname);
		stop = false;
		cont = false;
		in = new Scanner(System.in);
		currentPlayer = plr1;
	}
	
	void gameLoop() {
		while (stop == false){

			int round = 1;
			int start = 1;
			
			if(start == 1) {
				
				
				System.out.println("Enter a location between 1-64.");
				start++;
			}
			
			System.out.print("Player " + currentPlayer.getName() + " please enter your move:");

			
			cont = false;

			while(cont == false){

				
				
				round++;
				
				//tries to execute the game's functions
				try{
					
					gameBoard.play(currentPlayer.piece(),in.nextInt());
					cont= true;
					if(round >1) {
						gameBoard.printBoard();
					}
				}catch(Exception ex) {

					System.out.println(ex.getMessage() + "Try again.");
					if(ex.getMessage() == "Spot is taken.") {
						gameBoard.printBoard();
					}

				}
			}
			//if (currentPlay)

			if(gameBoard.isFull() == true) {
				stop = true;
			}

			if (stop == false) {
				if (currentPlayer.piece() =='X') {
					currentPlayer = plr2;
				}else {
					currentPlayer = plr1;
				}
			}
		}

		//I need a method named "hasWon" in board that counts how many pieces the 
		//player has in reference to the board total for at the end of the game
		if(gameBoard.hasWon(currentPlayer.piece()) == true) {
			System.out.println("Congrats player " + currentPlayer.getName() + " you have won!!");
		}else if(gameBoard.isFull() == true) {
			System.out.println("Game is a Tie!");
		}


	}
	

}
