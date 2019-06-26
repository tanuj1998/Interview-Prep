public class Sudoku{
	public boolean isSafe(int board[][], int row, int col, int num){

		//Check for column
		for(int i = 0; i < board.length; i++){
			if(board[row][i] ==  num){
				return false;
			}
		}

		//Check for row
		for(int j = 0; j < board.length; j++){
			if(board[j][col] == num){
				return false;
			}
		}

		int sqrt = (int) Math.sqrt(board.length); 
   		int boxRowStart = row - row % sqrt; 
    	int boxColStart = col - col % sqrt; 
  
    	for (int r = boxRowStart; r < boxRowStart + sqrt; r++)  
    	{ 
        for (int d = boxColStart;  d < boxColStart + sqrt; d++)  
        { 
            if (board[r][d] == num)  
            { 
                return false; 
            } 
        } 
    } 
  
        // if there is no clash, it's safe 
    return true; 

	}

	public boolean solveSudoku(int board[][], int n){
		int row = -1;
		int col = -1;
		boolean isEmpty = true; //To see what cell is empty and keep track of new filled ones

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(board[i][j] == 0){
					row = i;
					col = j;

					isEmpty = false;
					break;
				}
			}
			if(!isEmpty){
				break;
			}
		}

		if(isEmpty){
			return true;
		}

		for (int num = 1; num <= n; num++) { 

        if (isSafe(board, row, col, num)) { 
            board[row][col] = num; 
            if (solveSudoku(board, n))  { 
                return true; 
            }  
            else{ 
                board[row][col] = 0; // replace it 
            } 
        } 
    } 
    return false; 

	}
}