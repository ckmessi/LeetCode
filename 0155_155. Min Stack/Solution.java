c class MinStack {

    /** initialize your data structure here. */
    
    public Stack<Integer> stdStack = new Stack<Integer>();
    public Stack<Integer> minStack = new Stack<Integer>();
    
    public MinStack() {
        
    }
    
    public void push(int x) {
        this.stdStack.push(x);
        if(this.minStack.empty() == true){
            this.minStack.push(x);
        }
        else{
            if(this.minStack.peek() >= x){
                this.minStack.push(x);
            }
        }
    }
    
    public void pop() {
        int x = this.stdStack.pop();
        if(this.minStack.peek() == x){
            this.minStack.pop();
        }
    }
    
    public int top() {
        return this.stdStack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
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
