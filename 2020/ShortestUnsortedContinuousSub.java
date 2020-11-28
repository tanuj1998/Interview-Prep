class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] dup = nums.clone();
        Arrays.sort(dup);
        int start = dup.length;
        int end = 0;
        
        for(int i = 0; i < dup.length; i++){
            if(dup[i] != nums[i]){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }
        
        if((end - start) >= 0){
            return (end-start+1);
        }
        return 0;
    }
}