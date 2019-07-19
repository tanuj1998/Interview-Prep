public class Solution {
    public int maxp3(ArrayList<Integer> A) {
    Collections.sort(A);
    int n = A.size();
    int mul1 = A.get(n-1)*A.get(n-2)*A.get(n-3);
    int mul2 = A.get(n-1)*A.get(0)*A.get(1);
    
    return Math.max(mul1,mul2);
    }
}