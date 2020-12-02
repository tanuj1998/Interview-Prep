//Another way was create an extra array and add elements from n-k and then add elements from index 0 to k. Takes O(n) space
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    public void reverse(int[] arr, int start, int end){
        
      while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
    }
}