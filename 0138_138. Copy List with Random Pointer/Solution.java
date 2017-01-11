/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null){
            return null;
        }
        
        HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        RandomListNode root = new RandomListNode(head.label);
        map.put(head, root);
        
        Queue<RandomListNode> queue = new LinkedList<RandomListNode>();
        queue.add(head);
        while(queue.isEmpty() == false){
            RandomListNode node = queue.poll();
            // process next
            if(node.next == null){
                map.get(node).next = null;
            }
            else{
                if(map.containsKey(node.next) == false){
                    RandomListNode newNode = new RandomListNode(node.next.label);
                    map.put(node.next, newNode);
                    queue.add(node.next);
                }
                map.get(node).next = map.get(node.next);
            }
            // process random
            if(node.random == null){
                map.get(node).random = null;
            }
            else{
                if(map.containsKey(node.random) == false){
                    RandomListNode newNode = new RandomListNode(node.random.label);
                    map.put(node.random, newNode);
                    queue.add(node.random);
                }
                map.get(node).random = map.get(node.random);
            }
        }
        
        return root;
    }
}
