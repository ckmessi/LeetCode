public class MyQueue {

    public Stack<Integer> stack1;
    public Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(stack1.empty() == false){
            this.stack2.push(this.stack1.pop());
        }
        this.stack1.push(x);
        while(this.stack2.empty() == false){
            this.stack1.push(this.stack2.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return this.stack1.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return this.stack1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return this.stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
