package Othello;

import java.util.ArrayList;

public class Board {
	
	public static char[][] board = new char[10][10];
	
	/**
	 * Creates the beginning board
	 */
	public void startBoard() {
		//loop through rows
		for(int i = 0; i < 10; i++) {
			
			//loop through columns
			for(int j = 0; j < 10; j++) {
				board[i][j] = ' ';
			}
		}
		board[4][4] = 'O';
		board[4][5] = 'X';
		board[5][4] = 'X';
		board[5][5] = 'O';
	}


	/**
	 * Prints the current board 
	 */
    public void printBoard() {
    	
        for (int i = 1; i < 9; i++) {
             for (int j = 1; j < 9; j++) {
            	 if(j == 9-1)
            		 System.out.print(board[i][j]);
            	 else	 
            		 System.out.print(board[i][j] + "|");
            }
            System.out.println();
            if(i == 9-1) {
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
		
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (board[i][j] == ' ') {
                    isFull = false;
                }
            }
        }
		
        return isFull;
    }
	
    
    /**
     *Changes location to row
     * @param location an int that is the number of the space
     * @return an integer that represents the row of the location
     */
	int getRow(int location) {
		return (Math.floorDiv(location-1, 9));
	}
	
	/**
	 * Changes location to column
	 * @param location an int that is the number of the space
	 * @return an integer that represents the column of the location
	 */
	public int getColumn(int location) {
		return (location-1) % 9;
	}
    
    
    /**
     * places a piece where the player chooses
     * @param currentPlayer - the player who made the move
     * @param location - the location that the player just placed a piece
     */
     public void placePiece(char currentPlayer, int location) {
    	 board[getRow(location)][getColumn(location)] = currentPlayer;
     }

     
     
        
   
     /**
      * Fills an ArrayList with all possible moves
      * @param currentPlayer - the player that made the move
      */
     public Object validMoves(char currentPlayer) {
    	 
    	 ArrayList<Integer> validMoves = new ArrayList<>();
    	 
    	 // Constructs an array of locations in our 8x8 board
    	 ArrayList<Integer> boardLocations = new ArrayList<>();
 		for(int i = 1, k = 1; i <= 89 && k <=100; i++, k++) {
 			if(k==1)
 				continue;
 			else if(k==10) {
 				k=0;
 				continue;
 			}
 				
 			else 
 				boardLocations.add(i);
 		}
    	 
    	 for(int location : boardLocations) {
    		 int R = getRow(location);
        	 int C = getColumn(location);
        	 
        	 if((board[R-1][C-1] == currentPlayer || board[R-1][C-1] == ' ') && (board[R-1][C] == currentPlayer || board[R-1][C] == ' ') 
        			 && (board[R-1][C+1] == currentPlayer || board[R-1][C+1] == ' ') && (board[R][C-1] == currentPlayer || board[R][C-1] == ' ') 
        			 && (board[R][C+1] == currentPlayer || board[R][C+1] == ' ') && (board[R+1][C-1] == currentPlayer || board[R+1][C-1] == ' ') 
        			 && (board[R+1][C] == currentPlayer || board[R+1][C] == ' ') && (board[R+1][C-1] == currentPlayer || board[R+1][C-1] == ' ')) {
        		 continue;
        	 }
        	 
        	//Checks row to the left
        	 if(board[R][C-1] != currentPlayer && board[R][C-1] != ' ') {
        		 for(int i=C-1; i >= 1; i--) {
        			 if (board[R][i] == ' ') {
        				 continue;
        			 }
        			 else if (board[R][i] == currentPlayer) {
        				 validMoves.add(location);
        				 continue;
        			 }
        		 }
        	 }
        	 
        	//Checks row to the right
        	 if(board[R][C+1] != currentPlayer && board[R][C+1] != ' ') {
        		 for(int i=C+1; i <= 9; i++) {
        			 if (board[R][i] == ' ') {
        				 continue;
        			 }
        			 else if (board[R][i] == currentPlayer) {
        				 validMoves.add(location);
        				 continue;
        			 }
        		 } 
        	 }
        	 
        	//Checks column up
        	 if(board[R-1][C] != currentPlayer && board[R-1][C] != ' ') {
        		 for(int i=R-1; i >= 1; i--) {
        			 if (board[i][C] == ' ') {
        				 continue;
        			 }
        			 else if (board[i][C] == currentPlayer) {
        				 validMoves.add(location);
        				 continue;
        			 }
        		 }
        	 }
        	 
        	//Checks column down
        	 if(board[R+1][C] != currentPlayer && board[R+1][C] != ' ') {
        		 for(int i=R+1; i <= 9; i++) {
        			 if (board[i][C] == ' ') {
        				 continue;
        			 }
        			 else if (board[i][C] == currentPlayer) {
        				 validMoves.add(location);
        				 continue;
        			 }
        		 }
        	 }
        	 
        	//check diagonal up and left
        	 if(board[R-1][C-1] != currentPlayer && board[R-1][C-1] != ' ') {
	        	 for (int i=R-1, k=C-1; i >= 1 && k >= 1; i--, k--) {
	        		if (board[i][k] == ' ') {
	        			continue;
	        		}
	        		else if (board[i][k] == currentPlayer) {
	        			validMoves.add(location);
	        			continue;
	        		}
	        	 }
        	 }
        	 
        	//check diagonal up and right
        	 if(board[R-1][C+1] != currentPlayer && board[R-1][C+1] != ' ') {
	        	 for (int i=R-1, k=C+1; i >= 1 && k <= 9; i--, k++) {
	        		if (board[i][k] == ' ') {
	        			continue;
	        		}
	        		else if (board[i][k] == currentPlayer) {
	        			validMoves.add(location);
	        			continue;
	        		}
	        	 }
        	 }
        	 
        	//check diagonal down and left
        	 if(board[R+1][C-1] != currentPlayer && board[R+1][C-1] != ' ') {
	        	 for (int i=R+1, k=C-1; i <= 9 && k >= 1; i++, k--) {
	        		if (board[i][k] == ' ') {
	        			continue;
	        		}
	        		else if (board[i][k] == currentPlayer) {
	        			validMoves.add(location);
	        			continue;
	        		}
	        	 }
        	 }
        	 
        	//check diagonal down and right
        	 if(board[R+1][C+1] != currentPlayer && board[R+1][C+1] != ' ') {
	        	 for (int i=R+1, k=C+1; i <= 9 && k <= 9; i++, k++) {
	        		if (board[i][k] == ' ') {
	        			continue;
	        		}
	        		else if (board[i][k] == currentPlayer) {
	        			validMoves.add(location);
	        			continue;
	        		}
	        	 }
        	 }
    	 }
    	 return validMoves;
     }
     
      
    
     
     
     /**
      * Counts the number of pieces on the board for both players
      * @param currentPlayer the player that you are counting the pieces of
      * @return the number of pieces that player has on the board
      */
     public int countPieces(char currentPlayer) {
    	 int holder = 0;
    	 
    	 for (int i = 1; i < 9; i++) {
             for (int j = 1; j < 9; j++) {
            	 if (board[i][j] == currentPlayer) {
            		 holder++;
            	 }
             }
    	 }
    	 return holder;
     }
     
     
     /**
      * flips tiles adjacent to the piece played
      * @param currentPlayer - the player who made the move
      * @location - the space they placed the piece
      */
     public void flip(char currentPlayer, int location) {
    	 int r = getRow(location);
    	 int c = getColumn(location);
    	 //check row to the left
    	 boolean flipLeftRow = false;
    	 int toLeftColumn = c;
    	 for(int i=c-1; i >= 0; i--) {
    		 if (board[r][i] == ' ') {
    			 break;
    		 }
    		 else if (board[r][i] == currentPlayer) {
    			 toLeftColumn = i;
    			 flipLeftRow = true;
    			 break;
    		 }
    	 }
    	 
    	 //flip row to the left if applicable
    	 if (flipLeftRow) {
    		 for (int i=c-1; i >= toLeftColumn; i--) {
    			 board[r][i] = currentPlayer;
    		 }
    	 }
    	
    	 
    	 
    	//check row to the right
    	 boolean flipRightRow = false;
    	 int toRightColumn = c;
    	 for(int i=c+1; i < 10; i++) {
    		 if (board[r][i] == ' ') {
    			 break;
    		 }
    		 else if (board[r][i] == currentPlayer) {
    			 toRightColumn = i;
    			 flipRightRow = true;
    			 break;
    		 }
    	 }
    	 
    	 //flip row to the right if applicable
    	 if (flipRightRow) {
    		 for (int i=c+1; i <= toRightColumn; i++) {
    			 board[r][i] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	 
    	 //check column above
    	 boolean flipColumnAbove = false;
    	 int toRowAbove = r;
    	 for (int i=r-1; i > 0; i--) {
    		 if (board[i][c] == ' ') {
    			 break;
    		 }
    		 else if (board[i][c] == currentPlayer) {
    			 toRowAbove = i;
    			 flipColumnAbove = true;
    			 break;
    		 }
    	 }
    	 
    	 //flip column above if applicable
    	 if (flipColumnAbove) {
    		 for (int i=r-1; i >= toRowAbove; i--) {
    			 board[i][c] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	 
    	//check column below
    	 boolean flipColumnBelow = false;
    	 int toRowBelow = r;
    	 for (int i=r+1; i > 10; i++) {
    		 if (board[i][c] == ' ') {
    			 break;
    		 }
    		 else if (board[i][c] == currentPlayer) {
    			 toRowBelow = i;
    			 flipColumnBelow = true;
    			 break;
    		 }
    	 }
    	 
    	 //flip column below if applicable
    	 if (flipColumnBelow) {
    		 for (int i=r+1; i <= toRowBelow; i++) {
    			 board[i][c] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	 //check diagonal up and left
    	 boolean flipDiagonalUpLeft = false;
    	 int toRowLeft = r;
    	 int toColumnUp = c;
    	 for (int i=r-1, k=c-1; i >=0 && k>=0; i--, k--) {
    		if (board[i][k] == ' ') {
    			break;
    		}
    		else if (board[i][k] == currentPlayer) {
    			toRowLeft = i;
    			toColumnUp = k;
    			flipDiagonalUpLeft = true;
    			break;
    		}
    	 }
    	 
    	 //flip diagonal up and left if applicable
    	 if (flipDiagonalUpLeft) {
    		 for (int i=r-1, k=c-1; i >=0 && k>=0; i--, k--) {
        		board[i][k] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	 
    	//check diagonal up and right
    	 boolean flipDiagonalUpRight = false;
    	 int toRowRight = r;
    	 toColumnUp = c;
    	 for (int i=r-1, k=c+1; i >=0 && k<10; i--, k++) {
    		if (board[i][k] == ' ') {
    			break;
    		}
    		else if (board[i][k] == currentPlayer) {
    			toRowRight = i;
    			toColumnUp = k;
    			flipDiagonalUpRight = true;
    			break;
    		}
    	 }
    	 
    	 //flip diagonal up and right if applicable
    	 if (flipDiagonalUpRight) {
    		 for (int i=r-1, k=c+1; i >=0 && k<10; i--, k++) {
        		board[i][k] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	 
    	//check diagonal down and right
    	 boolean flipDiagonalDownRight = false;
    	 toRowRight = r;
    	 int toColumnDown = c;
    	 for (int i=r+1, k=c+1; i<10 && k<10; i++, k++) {
    		if (board[i][k] == ' ') {
    			break;
    		}
    		else if (board[i][k] == currentPlayer) {
    			toRowRight = i;
    			toColumnDown = k;
    			flipDiagonalDownRight = true;
    			break;
    		}
    	 }
    	 
    	 //flip diagonal down and right if applicable
    	 if (flipDiagonalDownRight) {
    		 for (int i=r+1, k=c+1; i<10 && k<10; i++, k++) {
        		board[i][k] = currentPlayer;
    		 }
    	 }
    	 
    	 
    	//check diagonal down and left.
    	 boolean flipDiagonalDownLeft = false;
    	 toRowLeft = r;
    	 toColumnDown = c;
    	 for (int i=r+1, k=c-1; i<10 && k>=0; i++, k--) {
    		if (board[i][k] == ' ') {
    			break;
    		}
    		else if (board[i][k] == currentPlayer) {
    			toRowLeft = i;
    			toColumnDown = k;
    			flipDiagonalDownLeft = true;
    			break;
    		}
    	 }
    	 
    	 //flip diagonal down and left if applicable
    	 if (flipDiagonalDownLeft) {
    		 for (int i=r+1, k=c-1; i<10 && k>=0; i++, k--) {
        		board[i][k] = currentPlayer;
    		 }
    	 }
     }    
}
