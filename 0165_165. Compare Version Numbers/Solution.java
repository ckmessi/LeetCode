public class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1List = version1.split("[.]");
        String[] v2List = version2.split("[.]");
        
        
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < v1List.length && idx2 < v2List.length){
            int v1Num = Integer.parseInt(v1List[idx1]);
            int v2Num = Integer.parseInt(v2List[idx2]);
            if(v1Num < v2Num){
                return -1;
            }
            else if (v1Num > v2Num){
                return 1;
            }
            else{
                idx1++;
                idx2++;
            }
        }
        
        if(idx1 < v1List.length){
            for(int i = idx1; i < v1List.length; i++){
                int v1Num = Integer.parseInt(v1List[i]);
                if(v1Num > 0){
                    return 1;
                }
            }
            return 0;
        }
        else if (idx2 < v2List.length){
            for(int i = idx2; i < v2List.length; i++){
                int v2Num = Integer.parseInt(v2List[i]);
                if(v2Num > 0){
                    return -1;
                }
            }
            return 0;
        }
        else{
            return 0;
        }
        
    }
}
