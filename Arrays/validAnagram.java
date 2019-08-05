/*
Given two strings s and t , write a function to determine if t is an anagram of s.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()){
    return false;
    }  
    char[] s1 = s.toCharArray();
    char[] s2 = t.toCharArray();
    
    Arrays.sort(s1);
    Arrays.sort(s2);
        
    return Arrays.equals(s1,s2);
    }
}