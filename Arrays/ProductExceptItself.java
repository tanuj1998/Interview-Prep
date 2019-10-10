/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to 
the product of all the elements of nums except nums[i].

Example:
Input:  [1,2,3,4]
Output: [24,12,8,6]
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        
        int[] left = new int[len];
        int[] right = new int[len];
        int ans[] = new int[len];
        
        left[0] = 1;
        for(int i = 1; i < len; i++){
            left[i] = nums[i-1]*left[i-1];
        }
        
        right[len-1] = 1;
        for(int i = len-2; i >= 0; i--){
            right[i] = nums[i+1]*right[i+1];
        }

        for(int i = 0; i < len; i++){
        ans[i] = left[i]*right[i];
        }
        return ans;
    }
}
