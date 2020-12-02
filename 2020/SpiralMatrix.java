class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
         if (m == 0){
            return result;
         }
         int dir = 0; // right
         int row = 0;
        int col = 0;
        int layer = 0;
         result.add(matrix[0][0]);
        for (int step = 1; step < m * n; step++) {
            switch(dir) {
                case 0:
                    if(col == n - layer - 1) {
                        dir = 1;
                        row++;
                    } else{
                        col++;
                    }
                    break;
                case 1:
                    if(row == m - layer - 1) {
                        dir = 2;
                        col--;
                    } else{
                        row++;
                    }
                    break;
                case 2:
                    if(col == layer) {
                        dir = 3;
                        row--;
                    } else{
                        col--;
                    }
                    break;
                case 3:
                    if(row == layer + 1) {
                        dir = 0;
                        col++;
                        layer++;
                    } else{
                        row--;
                    }
                    break;
            }
            result.add(matrix[row][col]);
        }
         return result; 
    }
}