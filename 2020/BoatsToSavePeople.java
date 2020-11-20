//What I could get in 15 mins. The case left to code out was when sum > limit
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int sum = 0;
        int i = 0;
        while(i < people.length){
            sum += people[i];
            if(sum == limit){
                count++;
                i++;
                sum = 0;
            }
            else if(sum > limit){
                count++;
                sum = 0;
            }
            else{
                i++;
            }
        }
        return count;
    }
}

//The solution I found later. Done using sorting. Went into DP approach instead of this one when I wrote out my solution.
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length-1;
        int ans = 0;
        
        while(i <= j){  
            ans++;
            if(people[i] + people[j] <= limit){
                i++;
            }
            j--;
        }
        return ans;
    }
}