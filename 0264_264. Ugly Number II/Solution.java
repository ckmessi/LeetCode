public class Solution {
    public int nthUglyNumber(int n) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 6; i++){
            list.add(i + 1);
        }
        if(n <= 6){
            return list.get(n - 1);
        }
        
        
        int[] indexList = new int[3];
        for(int k = 0; k < 3; k++){
            indexList[k] = 0;
        }
        List<Integer> factorList = new ArrayList<Integer>();
        factorList.add(2);
        factorList.add(3);
        factorList.add(5);
        
        
        int count = 6;
        while(count < n){
            for(int k = 0; k < 3; k++){
                while(indexList[k] < list.size() - 1 && list.get(indexList[k]) * factorList.get(k) <= list.get(list.size() - 1)){
                    indexList[k]++;
                }
            }
            int minValue = Integer.MAX_VALUE;
            int minK = 0;
            for(int k = 0; k < 3; k++){
                int r = list.get(indexList[k]) * factorList.get(k);
                if(r < minValue){
                    minValue = r;
                    minK = k;
                }
            }
            indexList[minK]++;
            list.add(minValue);
            count++;
            
        }
        
        return list.get(n - 1);
        
        
    }
}
