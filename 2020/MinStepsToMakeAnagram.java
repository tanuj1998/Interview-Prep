/* Store everything in hashmap with freq from string t. Loop over s and if map contains that char, reduce frequency by 1. If 
not, increase ans by 1 as we ll need to make a change to get the anagram.
*/
class Solution {
    public int minSteps(String s, String t) {
       HashMap<Character,Integer> map = new HashMap();
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                map.put(c,map.get(c)-1);
            }
            else{
                ans++;
            }
        }
        return ans;
    }
}