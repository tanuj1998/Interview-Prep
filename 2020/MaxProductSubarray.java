class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int max1 = nums[0];
        int min1 = nums[0];
        int ans = max1;
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            int max_temp = Math.max(curr,Math.max(max1*curr,min1*curr));
            min1 = Math.min(curr,Math.min(max1*curr,min1*curr));
            
            max1 = max_temp;
            ans = Math.max(ans,max1);
        }
        return ans;
    }
}