//My solution. O(nlogn) time and O(n) space
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        //add to map
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int len = map.size();
        
        List<Integer> list = new ArrayList<>();
        //add values(frequency of numbers) to arraylist
        for(int i: map.values()){
            list.add(i);
        }
        
        Collections.sort(list);
        int count = 0;
        
        //start from beginning and keep subtracting every time smt needs to be deleted
        //the numbers with lowest frequency should be deleted for min unique numbers
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > k){
                break;
            }
            k = k-list.get(i);
            count++;
        }
        return len-count;   
    }
}


//Solution using PQ. Found on leetcode discuss
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1); //calculate frequency of each character
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b)); //Add elements to pq according to their frequecny
        pq.addAll(map.keySet()); //All numbers are sorted according to their frequency
        while(k>0){ //Decrement the frequency by 1 in order of elements in pq until k becomes 0
            int temp=pq.peek(); 
            map.put(temp,map.getOrDefault(temp,0)-1);
            if(map.get(temp)==0){
                pq.remove();
            }
            k--;
        }
        return pq.size(); //At last you will have the least number of Unique elements in queue. VOILA!
    }