public class LRUCache {

    class DuLinkNode{
        public int key;
        public int value;
        public DuLinkNode next;
        public DuLinkNode prev;
        public DuLinkNode(int key, int value){
            this.key = key;
            this.value = value;
        }        
    }
    
    public DuLinkNode head = null;
    public DuLinkNode tail = null;
    public HashMap<Integer, DuLinkNode> map = new HashMap<Integer, DuLinkNode>();
    public int capacity = 0;
    public int size = 0;
    
    
    public void addNodeToHead(DuLinkNode node){
        if(head == null){
            this.head = node;
            this.tail = node;
        }
        else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
        this.map.put(node.key, node);
        this.size++;
    }
    
    public void removeTailNode(){
        if(this.head == null){
            return;
        }
        
        this.map.remove(this.tail.key);
        if(this.head == this.tail){
            this.head = null;
            this.tail = null;
        }
        else{
            this.tail.prev.next = null;
            this.tail = this.tail.prev;
        }
        this.size--;
        
    }
    
    public void moveNodeAhead(DuLinkNode node){
        if(this.head == node){
            return;
        }
        
        node.prev.next = node.next;
        if(node.next == null){
            this.tail = node.prev;
        }
        else{
            node.next.prev = node.prev;
        }
        
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
    }
    
    public int get(int key) {
        if(map.containsKey(key) == false){
            return -1;
        }
        else{
            DuLinkNode node = map.get(key);
            this.moveNodeAhead(node);
            return node.value;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key) == false){
            if(this.size == this.capacity){
                this.removeTailNode();
            }
            DuLinkNode node = new DuLinkNode(key, value);
            this.addNodeToHead(node);
        }
        else{
            DuLinkNode node = map.get(key);
            node.value = value;
            this.moveNodeAhead(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
