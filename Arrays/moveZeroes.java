class Solution {
    public void moveZeroes(int[] nums) {
    int check = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[check] = nums[i];
            check++;
        }
    }
    for (int i = check; i < nums.length; i++) {
        nums[i] = 0;
    }
        
    }
}
