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
