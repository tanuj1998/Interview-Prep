/*Thought of another way to do it which was check if next number is smaller than current one.
If true, the current element is a peak. That took O(n) time and O(1) space.
Solution below takes O(logn) time and O(1) space
*/
public class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}