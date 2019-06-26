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


	}

	public boolean solveSudoku(int board[][], int n){
		int row, col;

	}
}