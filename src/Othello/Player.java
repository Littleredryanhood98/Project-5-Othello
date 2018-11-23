package Othello;

public class Player {
	char player;
	boolean isAi;
	String name;
	
	public Player(char c, boolean Ai, String name) {
		player = c;
		isAi = Ai;
		this.name = name;
	}
	
	public boolean availablemoves() {
		//I need to see more of board completed.
		
		return true;
	}
	public String getName() {
		return name;
	}
	public char piece() {
		return player;
	}
	
	
	
//	taylor is the best human being ever!!!!!!! 
}
