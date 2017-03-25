public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
        
        List<int[]> heightList = new ArrayList<int[]>();
        for(int i = 0; i < buildings.length; i++){
            int left = buildings[i][0];
            int right = buildings[i][1];
            int height = buildings[i][2];
            
            int[] x1 = new int[2];
            x1[0] = left;
            x1[1] = -height;
            int[] x2 = new int[2];
            x2[0] = right;
            x2[1] = height;
            
            heightList.add(x1);
            heightList.add(x2);
        }
        
        Collections.sort(heightList, new Solution().new sortClass());
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(11, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return b - a;
            } 
        });
        
        List<int[]> list = new ArrayList<int[]>();
        int preHeight = 0;
        pq.add(0);
        for(int i = 0; i < heightList.size(); i++){
            if(heightList.get(i)[1] < 0){
                pq.add(-heightList.get(i)[1]);
            }
            else{
                pq.remove(heightList.get(i)[1]);
            }
            
            int curHeight = 0;
            if(pq.peek() != null){
                curHeight = pq.peek();
            }
            if(curHeight != preHeight){
                int[] x = new int[2];
                x[0] = heightList.get(i)[0];
                x[1] = curHeight;
                list.add(x);
                preHeight = curHeight;
            }
        }
        
        return list;
    }
    
    public class sortClass implements Comparator<int[]>{
        public int compare(int[] o1, int[] o2){
            if(o1[0] < o2[0]){
                return -1;
            }
            else if (o1[0] > o2[0]){
                return 1;
            }
            else{
                return o1[1] - o2[1];
            }
        }
    }
}
