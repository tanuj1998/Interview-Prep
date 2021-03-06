/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Example:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.
*/
class MinStack {

      Stack<Integer> s;
        Stack<Integer> m;
    /** initialize your data structure here. */
    public MinStack() {
    s = new Stack<>();
            m = new Stack<Integer>() {{
                push(-1);
            }};    
    }
    
    public void push(int x) {
    if (s.isEmpty() || m.peek() > x) {
                m.push(x);
            } else {
                m.push(m.peek());
            }            
            s.push(x);    
    }
    
    public void pop() {
     if (s.isEmpty()) return;
            s.pop();
            m.pop();    
    }
    
    public int top() {
       if (s.isEmpty()) return -1;
            return s.peek();   
    }
    
    public int getMin() {
     return m.peek();    
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */