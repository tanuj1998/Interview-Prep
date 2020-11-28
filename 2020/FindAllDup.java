//Another approach was sort it and see if next one same if yes then its duplicate. Takes O(nlogn)
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {
            if (visited.contains(num)) {
                ans.add(num);
            } else {
                visited.add(num);
            }
        }

        return ans;
    }
}