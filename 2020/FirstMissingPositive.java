//My Solution.
class Solution {
  public int firstMissingPositive(int[] nums) {
    Set<Integer> numbers = new HashSet<>();
        int min_positive = 0;
        for(int num:nums){
            if(num>0){
                min_positive = Math.min(min_positive,num);
                numbers.add(num);
            }
        }
        int check = min_positive+1;
        while(numbers.contains(check)){
            check++;
        }
        
        return check;
  }
}

//Found a better solution with constant space
class Solution {
    public int firstMissingPositive(int[] nums) {
        int arr[] = new int[nums.length+1];
        
        for(int i:nums){
            if(i >= 1 && i <= nums.length){
            arr[i] = 1;   
            }
        }
        for(int i = 1;i < arr.length; i++){
            if(arr[i] == 0){
                return i;
            }
        }
        return nums.length+1;  
    }
}