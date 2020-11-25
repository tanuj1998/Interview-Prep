class Solution {
    public boolean exist(char[][] board, String word) {
        char[] w = word.toCharArray();
        boolean res=false;
       for(int i=0;i<board.length;i++){
           for(int j=0;j<board[i].length;j++){
               if(board[i][j]==word.charAt(0)){
                   if(helper(word, board, i ,j,0)){
                       return true;
                   }
               }
           }
       }
        return false;
    }
    private boolean helper(String word, char[][] board, int i, int j,int k){
		//Edge Cases
        if(i<0||j<0||i>=board.length||j>=board[i].length||board[i][j]!=word.charAt(k)){
            return false;
        }
		//we reached the end of the word
        if(k==word.length()-1){
            return true;
        }
       
	   //Mark Visited
		char a=board[i][j];
		board[i][j]='0';
		
        //check Neighbours
        if(helper(word,board,i+1,j,k+1) || helper(word,board,i,j+1,k+1) || helper(word,board,i-1,j,k+1) || helper(word,board,i,j-1,k+1)){
            return true;
        }
        else{
                board[i][j]=a;
                return false;
         
        }
    }
}