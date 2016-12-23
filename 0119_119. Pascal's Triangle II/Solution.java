public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        if(rowIndex < 0){
            return list;
        }
        int[] line = new int[rowIndex + 1];
        for(int i = 0; i <= rowIndex; i++){
            int last = 0;
            for(int j = 0; j <= i; j++){
                int tmp_save = line[j];
                if(j == 0 || j == i){
                    line[j] = 1;
                }
                else{
                    line[j] = last + line[j];
                }
                last = tmp_save;
            }
        }
        for(int i = 0; i <= rowIndex; i++){
            list.add(line[i]);
        }
        return list;
    }
}
