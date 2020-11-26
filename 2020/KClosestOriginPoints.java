class Solution {
    public int helper(int[] arr) {
        return arr[0] * arr[0] + arr[1] * arr[1];
    }
    public int[][] kClosest(int[][] points, int K) {
       int n = points.length;
        int[] distance = new int[n];
        for(int i = 0; i < n; i++){
            distance[i] = helper(points[i]);
        }
        
        Arrays.sort(distance);
        int kth_distance = distance[K-1];
        
        int[][] ans = new int[K][2];
        int x = 0;
        for(int i = 0; i < n; i++){
            if(helper(points[i]) <= kth_distance){
                ans[x] = points[i];
                x++;
            }
        }
        return ans;
    }
}