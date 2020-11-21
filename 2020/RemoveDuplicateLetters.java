class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        HashSet<Character> visited = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i);
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (!visited.contains(c)){
                while(!stack.isEmpty() && c < stack.peek() && map.get(stack.peek()) > i){
                    visited.remove(stack.pop());
                }
                visited.add(c);
                stack.push(c);
            }
        }
    StringBuilder ans = new StringBuilder(stack.size());
    for (Character c : stack){
        ans.append(c.charValue());
    }
    return ans.toString();
    }
}