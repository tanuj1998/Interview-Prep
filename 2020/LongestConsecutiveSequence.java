class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int longcount = 1;
        int currcount = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1){
                    currcount += 1;
                }
                else{
                    longcount = Math.max(currcount,longcount);
                    currcount = 1;
                }
            }
        }
        return Math.max(currcount,longcount);
    }
}

//Better solution found on leetcode
public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if (nums.length == 0) return 0;

        for (int x : nums) {
            set.add(x);
        }
        int ans = 1;
        for (int x : nums) {
            int count = 1;
            if (!set.contains(x-1)) {
                while (set.contains(x + 1)) {
                    count++;
                    x = x + 1;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }