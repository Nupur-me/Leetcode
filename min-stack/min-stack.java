class MinStack {

    Stack<Integer> stack =  new Stack<>();
    Stack<Integer> min_ele = new Stack<>();
    
    public void push(int val) {
        if(min_ele.isEmpty() || val <= min_ele.peek()){
            min_ele.push(val);
        }
        
        stack.push(val);
    }
    
    public void pop() {
        if(stack.peek().equals(min_ele.peek())){
            min_ele.pop();
        }
        
        stack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return min_ele.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */