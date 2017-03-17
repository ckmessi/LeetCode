public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        HashMap<Integer, List<Integer>> nextListMap = new HashMap<Integer, List<Integer>>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            indegree[i] = 0;
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            int c = prerequisites[i][0];
            int p = prerequisites[i][1];
            indegree[c]++;
            if(nextListMap.containsKey(p) == false){
                nextListMap.put(p, new ArrayList<Integer>());
            }
            nextListMap.get(p).add(c);
        }
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        
        
        int[] order = new int[numCourses];
        int count = 0;
        while(queue.isEmpty() == false){
            int c = queue.poll();
            order[count] = c;
            count++;
            
            if(nextListMap.containsKey(c) == true){
                for(int i = 0; i < nextListMap.get(c).size(); i++){
                    int n = nextListMap.get(c).get(i);
                    indegree[n]--;
                    if(indegree[n] == 0){
                        queue.add(n);
                    }
                }
            }
        }
        
        if(count == numCourses){
            return order;
        }
        else{
            return new int[0];
        }
    }
}
