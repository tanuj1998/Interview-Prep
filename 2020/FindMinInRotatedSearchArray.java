//Mine
class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans = Math.min(ans,nums[i]);
        }
        return ans;
    }
}


//Optimized solution. Was able to detect BST to use but couldnt figure out all the if condistions
class Solution {
  public int findMin(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
      
    if (nums.length == 1) {
      return nums[0];
    } 
    if (nums[end] > nums[0]) {
      return nums[0];
    }
    
    while (start <= end) {
      int mid = start + (end - start) / 2;
        
      if (nums[mid] > nums[mid + 1]) {
        return nums[mid + 1];
      }
      if (nums[mid - 1] > nums[mid]) {
        return nums[mid];
      }
      if (nums[mid] > nums[0]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }
}