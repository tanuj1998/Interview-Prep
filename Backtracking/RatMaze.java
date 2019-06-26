public class RatMaze{
	static int N;

	boolean isSafe(int maze[][],int x, int y){
	return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
	}

	boolean solveMaze(int maze[][], int x, int y, int sol[][]){
	if(x == (N-1) && y == (N-1)){
		sol[x][y] = 1; //set 1 in the solution matrix
		return true;
	}

	if(isSafe(maze,x,y) == true){
		sol[x][y] == 1; //mark [x][y] as part of solution

		if(solveMaze(maze,x+1,y,sol) == true){ //Move in x direction
			return true; 
		}

		if(solveMaze(maze,x,y+1,sol) == true){ //Move in y direction
			return true;
		}

		//If none of the movement works, that means no solution found
		sol[x][y] = 0;
		return false;
	}
	return false;
	}
}