class Solution {

    private TreeMap<Integer, Integer> map;
    private int[][] rects;
    private int sum;
    Random rnd= new Random();    
    
    public Solution(int[][] rects) {
        this.rects = rects;
        map = new TreeMap<>();
        sum = 0;
        for(int i = 0; i < this.rects.length; i++){
            int[] rect = this.rects[i];
            sum += (rect[2] - rect[0] + 1) * (rect[3] - rect[1] + 1);
            map.put(sum, i);
        }
    }
    
    public int[] pick() {
        
        int c = map.ceilingKey(rnd.nextInt(sum) + 1);
        
        int[] rect = this.rects[map.get(c)];
        
        int x = generateRandomIncludeBoundary(rect[0], rect[2]);
        int y = generateRandomIncludeBoundary(rect[1], rect[3]);
        int[] result = {x, y};
        
        return result;
    }
    
    private int generateRandomIncludeBoundary(int min, int max){
        max = max + 1;
        int intBounded = min + ((int)(new Random().nextFloat() * (max - min)));
        return intBounded;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */
