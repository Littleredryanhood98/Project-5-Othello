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
		Player plr1 = new Player('X',Aiplr,plrname);
		Player plr2 = new Player('O',Aiotrplr,otrplrname);
		stop = false;
		cont = false;
		in = new Scanner(System.in);

	}
	
	void gameLoop() {
		while (stop == false){

			int round = 1;
			int start = 1;
			
			if(start == 1) {
				//idk the board size
				
				System.out.println("Enter a location between 1-64.");
				start++;
			}
			
			System.out.print("Player " + currentPlayer + " please enter your move:");

			
			cont = false;

			while(cont == false){

				
				
				round++;
				
				//tries to execute the game's functions
				try{
					
					gameBoard.play(currentPlayer,in.nextInt());
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

			if(gameBoard.hasWon(currentPlayer) == true) {
				stop = true;	
			}else if(gameBoard.isFull() == true) {
				stop = true;
			}

			if (stop == false) {
				if (currentPlayer =='X') {
					currentPlayer = 'O';
				}else {
					currentPlayer = 'X';
				}
			}
		}

		if(gameBoard.hasWon(currentPlayer) == true) {
			System.out.println("Congrats player " + currentPlayer + " you have won!!");
		}else if(gameBoard.isFull() == true) {
			System.out.println("Game is a Tie!");
		}


	}
	

}
