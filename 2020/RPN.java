class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String token: tokens){
            if(!"+-*/".contains(token)){
                st.push(Integer.valueOf(token));
                continue;
            }
            int num2 = st.pop();
            int num1 = st.pop();
            
            int res = 0;
            
            switch(token){
                case "+":
                    res = num1+num2;
                    break;
                case "-":
                    res = num1-num2;
                    break;
                case "*":
                    res = num1*num2;
                    break;
                case "/":
                    res = num1/num2;
                    break;
            }
            st.push(res);
        }
        return st.pop();
        
    }
}