package Othello;

import java.util.ArrayList;

public class Board {
	
	
	public Board() {
		
	}

	
	public static char[][] board = new char[8][8];
	
	
	
	/**
	 * Creates the beginning board
	 */
	public void startBoard() {
		//loop through rows
		for(int i = 0; i < 8; i++) {
			
			//loop through columns
			for(int j = 0; j < 8; j++) {
				board[i][j] = ' ';
			}
		}
		board[3][3] = 'O';
		board[3][4] = 'X';
		board[4][3] = 'X';
		board[4][4] = 'O';
	}




	/**
	 * Prints the current board 
	 */
    public void printBoard() {
    	
        for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 8; j++) {
            	 if(j==8 - 1)
            	System.out.print(board[i][j]);
            	 else	 
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            if(i == 8 - 1) {
            }
            else	 
                System.out.println("--------------");
        }
    }
    
    
    
    /**
     * Determines if the board is full
     * @return a boolean - true if the board is full and false if the board is empty
     */
    public boolean isFull() {
        boolean isFull = true;
		
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
		
        return isFull;
    }
	
    
    /**
     *Changes location to row
     * @param location
     * @return an integer that represents the row of the location
     */
	int getRow(int location) {
		return (Math.floorDiv(location-1, 8));
	}
	
	/**
	 * Changes location to column
	 * @param location
	 * @return an integer that represents the column of the location
	 */
	int getColumn(int location) {
		return 0;
	}
    
    
    /**
     * fills board with player moves 
     * @param currentPlayer - the player who made the move
     * @param location - the location that the player just placed a piece
     */
     public void play(char currentPlayer, int location) {
    
     }
     
     
     
     
     public int checkUL(int location) {
    	 int R = getRow(location);
    	 int C = getColumn(location);
    	 
    	 
    	 
     }
     
     
     
     /**
      * checks if a player move is valid
      * @param currentPlayer - the player that made the move
      * @param location - the space they made the move in 
      * 
      */
     public Object validPlay(char currentPlayer) {
    	
     }
     
     
     /**
      * Counts the number of pieces on the board for both players
      * @param currentPlayer the player that you are counting the pieces of
      * @return the number of pieces that player has on the board
      */
     public int countPieces(char currentPlayer) {
    	 int holder = 0;
    	 
    	 for (int i = 0; i < 8; i++) {
             for (int j = 0; j < 8; j++) {
            	 if (board[i][j] == currentPlayer) {
            		 holder++;
            	 }
             }
    	 }
    	 
    	 return holder;
     }
     
     
     /**
      * Flips adjacent tiles to the one just placed
      */
     public void flip() {
    	 
     }
     
     
    
    
    
    
    
    
    
    
    
    
}
