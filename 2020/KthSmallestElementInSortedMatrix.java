//My solution
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((n1, n2) -> n2 - n1);
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                maxHeap.add(matrix[i][j]);
                if(maxHeap.size() > k){
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}

//Binary Search approach with better runtime. Saw this on leetcode discuss
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
      int m = matrix.length, n = matrix[0].length;
        int low = matrix[0][0], high = matrix[m - 1][n - 1];
        while (low < high) {
            int mid = (high - low) / 2 + low;
            int count = 0; 
            int j = n - 1;
            for (int i = 0; i < m; i++) {
                while (j >= 0 && matrix[i][j] > mid)
                    j--;
                count += j + 1;
            }
            if (count < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}