class Solution {
    public String minRemoveToMakeValid(String s) {
       Set<Integer> indexesToRemove = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            if(s.charAt(i) == ')'){
                if(st.isEmpty()){
                    indexesToRemove.add(i);
                }
                else{
                    st.pop();
                }
            }
        }
        
        while(!st.isEmpty()){
            indexesToRemove.add(st.pop());
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(!indexesToRemove.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}