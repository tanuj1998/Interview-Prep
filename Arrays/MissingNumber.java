/*
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
Input: [3,0,1]
Output: 2
*/
public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int num: nums){
        set.add(num);
        }
        
        int expectedCount = nums.length+1;
        
        for(int i = 0; i < expectedCount; i++){
            if((!set.contains(i))){
            return i;
            }
        }
        return -1;
    }