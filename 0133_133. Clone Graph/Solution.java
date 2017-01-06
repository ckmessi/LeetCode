/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
        UndirectedGraphNode root = new UndirectedGraphNode(node.label);
        map.put(node, root);
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        queue.add(node);
        while(queue.isEmpty() == false){
            UndirectedGraphNode p = queue.poll();
            for(int i = 0; i < p.neighbors.size(); i++){
                UndirectedGraphNode neighbor = p.neighbors.get(i);
                if(map.containsKey(neighbor) == false){
                    UndirectedGraphNode newNode = new UndirectedGraphNode(neighbor.label);
                    map.put(neighbor, newNode);
                    queue.add(neighbor);
                }
                map.get(p).neighbors.add(map.get(neighbor));
            }
        }
        return root;
    }
}
