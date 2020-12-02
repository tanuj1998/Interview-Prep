class Solution {
    public int[] searchRange(int[] nums, int target) {
       // Set<Integer> indexes = new HashSet<>();
        int[] ans = {-1,-1};
 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                ans[0] = i;
                break;
            }
        }
       
        if(ans[0] == -1){
            return ans;    
        }
        for(int j = nums.length-1; j >= 0; j--){
            if(nums[j] == target){
                ans[1] = j;
                break;
            }
        }
        return ans;
    }
}