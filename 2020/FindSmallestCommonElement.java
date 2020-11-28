class Solution {
    public int smallestCommonElement(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int ans[] = new int[100005];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ++ans[mat[i][j]];
            }
        }
        
        for(int k = 1; k <= 10000; k++){
            if(ans[k] == m){
                return k;
            }
        }
        return -1;
        
    }
}