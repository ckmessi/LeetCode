public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        HashMap<Integer, List<Integer>> nextListMap = new HashMap<Integer, List<Integer>>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            indegree[i] = 0;    
        }
        
        for(int i = 0; i < prerequisites.length; i++){
            int course = prerequisites[i][0];
            int prerequisite = prerequisites[i][1];
            indegree[course]++;
            if(nextListMap.containsKey(prerequisite) == false){
                nextListMap.put(prerequisite, new ArrayList<Integer>());
            }
            nextListMap.get(prerequisite).add(course);
        }
        
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i = 0; i < indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }
        
        int finishCount = 0;
        while(queue.isEmpty() == false){
            int course = queue.poll();
            finishCount++;
            
            if(nextListMap.containsKey(course) == true){
                for(int i = 0; i < nextListMap.get(course).size(); i++){
                    int nextCourse = nextListMap.get(course).get(i);
                    indegree[nextCourse]--;
                    if(indegree[nextCourse] == 0){
                        queue.add(nextCourse);
                    }
                }
            }
        }
        
        if(finishCount == numCourses){
            return true;
        }
        else{
            return false;
        }
        
        
    }
}
