c class MyStack {
    
    public Queue<Integer> q1 = new LinkedList<Integer>();
    public Queue<Integer> q2 = new LinkedList<Integer>();
    

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        while(this.q1.isEmpty() == false){
            this.q2.add(this.q1.poll());
        }
        this.q1.add(x);
        while(this.q2.isEmpty() == false){
            this.q1.add(this.q2.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return this.q1.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return this.q1.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return this.q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
