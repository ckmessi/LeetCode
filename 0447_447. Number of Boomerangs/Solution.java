class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        HashMap<Integer, Integer> distanceMap = new HashMap<>();
        for(int i = 0; i < points.length; i++){
            for(int j = 0; j < points.length; j++){
                if(i == j){
                    continue;
                }
                int d = calculateDistance(points[i], points[j]);
                distanceMap.put(d, distanceMap.getOrDefault(d, 0) + 1);                
            }
            for(int val: distanceMap.values()){
                count += val * (val - 1);
            }
            distanceMap.clear();
        }
        return count;
    }
    private int calculateDistance(int[] p1, int[] p2){
        int dx = p1[0] - p2[0];
        int dy = p1[1] - p2[1];
        return dx * dx + dy * dy;
    }
}
