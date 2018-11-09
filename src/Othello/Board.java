package Othello;

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
     * @return
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
     * @return
     */
	int getRow(int location) {
		
		return (Math.floorDiv(location-1, 8));
	}
	
	/**
	 * Changes location to column
	 * @param location
	 * @return
	 */
	int getColumn(int location) {
		
		return 0;
	}
    
    
    /**
     * Fills board with players moves while making sure they are legal.
     * @param currentPlayer
     * @param location
     * @throws Exception
     */
     void play(char currentPlayer, int location) throws Exception{
     	
     }
     
     
     
     /**
      * Counts the number of pieces on the board for both players
      */
     void count() {
    	 
     }
     
     
     /**
      * Flips adjacent tiles to the one just placed
      */
     void flip() {
    	 
     }
     
     
    
    
    
    
    
    
    
    
    
    
}
