package Othello;

import java.util.Scanner;

public class Othello {
	
//	Create Game and call gameloop
	
	
	
	
	
	public static void main(String[] args) {
	String plrname;
	String plrname2;
	boolean Ai;
	int numplr;
	Scanner scrn = new Scanner(System.in);
		System.out.println("Enter the number of players no more than two players:");
		numplr = scrn.nextInt();
		if (numplr == 2) {
			System.out.println("Player one enter your name:");
			plrname = scrn.next();
			System.out.println("Player two enter your name:");
			plrname2 = scrn.next();
			Game Othello = new Game(plrname,false,plrname2,false);
		Othello.gameLoop();
		} else if(numplr == 1) {
			System.out.println("Player one enter your name:");
			plrname = scrn.next();
			Game Othello = new Game(plrname,false,"Computer",true);
		Othello.gameLoop();
		}
		
	
//	
//	Board b = new Board();
//	b.startBoard();
//	b.printBoard();
//	
	}

}
