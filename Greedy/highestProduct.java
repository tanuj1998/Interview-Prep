/*
Given an array of integers, return the highest product possible by multiplying 3 numbers from the array
[0, -1, 3, 100, 70, 50]

=> 70*50*100 = 350000
*/

public class Solution {
    public int maxp3(ArrayList<Integer> A) {
    Collections.sort(A);
    int n = A.size();
    int mul1 = A.get(n-1)*A.get(n-2)*A.get(n-3);
    int mul2 = A.get(n-1)*A.get(0)*A.get(1);
    
    return Math.max(mul1,mul2);
    }
}