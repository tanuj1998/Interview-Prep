/*
Given an array of integers, sort the array into a wave like array and return it, 
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....


*/
public class Solution {
    
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        
        int len = A.size();
        
        Collections.sort(A);
        for(int i = 0; i < len-1; i = i+2){
            int temp = A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,temp);
        }
        return A;
    }
}
