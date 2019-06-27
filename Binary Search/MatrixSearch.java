public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
     int low =0; 
     int high = a.size(0)- 1;
     
    while(low < a.size() && high >=0)
    {
    if(a.get(low).get(high) == b){
      return 1;
    }
    else if(A[i][j] > B){
      high--;
    }
    else{
      low++;
    }
    }

    return 0; 
        
    }
}