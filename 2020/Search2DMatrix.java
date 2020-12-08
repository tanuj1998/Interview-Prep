//naive solution was go through entire matrix and see if numbers exists. O(nm) for naive solution.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) return false;
        int n = matrix[0].length;
        
        int left = 0, right = (m*n)-1;
        while(left <= right){
            int midIndex = (left+right)/2;
            int midEle = matrix[midIndex/n][midIndex%n];
            
            if(target == midEle) return true;
            else{
                if(target < midEle) right = midIndex - 1;
                else left = midIndex+1;
            }
        }
        return false;
    }
}