//TLE
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length){
            int j = i+1;
            int k = nums.length - 1;
            while(j < k){
                long sum = (long)nums[i] + (long)nums[j] + (long)nums[k];
                if(sum == 0){
                    ArrayList<Integer> ans = new ArrayList<Integer>();
                    ans.add(nums[i]);
                    ans.add(nums[j]);
                    ans.add(nums[k]);
                    if(!res.contains(ans)){
                        res.add(ans);
                    }
                }
                if(sum > 0){
                    k--;
                }
                else{
                    j++;
                }
            }
            i++;
        }
        return res; 
    }
}

//Found on leetcode
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
}