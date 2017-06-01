c class MedianFinder {

    public PriorityQueue<Integer> maxQueue;
    public PriorityQueue<Integer> minQueue;


    /** initialize your data structure here. */
    public MedianFinder() {
        
        this.maxQueue = new PriorityQueue<Integer>(1001, Collections.reverseOrder());
        this.minQueue = new PriorityQueue<Integer>();
        
    }
    
    public void addNum(int num) {
        this.maxQueue.offer(num);
        this.minQueue.offer(this.maxQueue.poll());
        if(this.minQueue.size() > this.maxQueue.size()){
            this.maxQueue.offer(this.minQueue.poll());
        }
    }
    
    public double findMedian() {
        if(this.maxQueue.size() > this.minQueue.size()){
            return this.maxQueue.peek();
        }
        else{
            return (double)(this.maxQueue.peek() + this.minQueue.peek()) / 2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
