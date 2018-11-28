package Othello;

public class Player {
	char player;
	boolean isAi;
	String name;
	boolean isTurn;
	
	public Player(char c, boolean Ai, String name) {
		player = c;
		isAi = Ai;
		this.name = name;
		if (c == 'X') {
			isTurn = true;
		} else if(c == 'O'){
			isTurn = false;
		}
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
	public void Setturn(boolean is) {
		isTurn = is;
	}
	public boolean Getturn() {
		return isTurn;
	}
}
