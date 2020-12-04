class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        
        for(int i = 0; i < n; i++){
            sum = sum+nums[i];
            while(sum >= s){
                ans = Math.min(ans,i+1-left);
                sum = sum - nums[left++];
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}