/*
Given a non-empty array of non-negative integers nums, the degree of this array is defined 
as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) 
subarray of nums, that has the same degree as nums.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation: 
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.

Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6

*/
class Solution {
    public int findShortestSubArray(int[] nums) {
     Map<Integer, Integer> left = new HashMap();
        Map<Integer, Integer> right = new HashMap();
        Map<Integer, Integer> count = new HashMap();
        
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(left.get(x) == null){
                left.put(x,i);
            }
            right.put(x,i);
            count.put(x, count.getOrDefault(x,0)+1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        
        for(int x: count.keySet()){
            if(count.get(x) == degree){
                ans = Math.min(ans, right.get(x) - left.get(x)+1);
            }
            
        }
        return ans;
    }
}