/*
Design and implement a data structure for LRU (Least Recently Used) cache. It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
set(key, value) - Set or insert the value if the key is not already present. When the cache reaches its capacity, it 
should invalidate the least recently used item before inserting the new item.
The LRU Cache will be initialized with an integer corresponding to its capacity. Capacity indicates the maximum 
number of unique keys it can hold at a time.


Example :

Input : 
         capacity = 2
         set(1, 10)
         set(5, 12)
         get(5)        returns 12
         get(1)        returns 10
         get(10)       returns -1
         set(6, 14)    this pushes out key = 5 as LRU is full. 
         get(5)        returns -1 
*/

public class Solution {
    private int c;
    private HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    private ArrayList<Integer> al = new ArrayList<Integer>();
    private int count = 0;
    
    public Solution(int capacity) {
        this.c = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){ //Check if map contains key
            removeElem(key); //remove that key
            addFront(key,map.get(key)); //add to front
            return map.get(key); //return 
        }
        else{
            return -1;
        }
    }

     public void set(int key, int value) {
         
        if(!(map.containsKey(key))){ //If not in the map
            if(count < c){ //see not reached max capacity
                addFront(key,value); //add value
            }
            else{
                removeAtLast(); //remove last elem
                addFront(key,value); //add there
            }
        }
        else{
            removeElem(key); //remove that elem
            addFront(key,value); //add new one
        }
    }
    
    
}