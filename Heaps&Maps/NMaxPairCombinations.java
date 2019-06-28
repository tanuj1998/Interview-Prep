 public class NMaxPairCombinations{
 public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        Collections.sort(A,Collections.reverseOrder());
        Collections.sort(B,Collections.reverseOrder());
        int len = A.size();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < B.size(); j++){
                int sum = A.get(i)+B.get(j);
                if(pq.size() < len){
                    pq.add(sum);
                }
                else{
                    if(sum > pq.peek()){
                        pq.poll();
                        pq.add(sum);
                    }
                    else{
                        break;
                    }
                }
            }
        }
        
        ArrayList<Integer> ret = new ArrayList<>(pq);
        Collections.sort(ret,Collections.reverseOrder());
        return ret;
        
    }
}