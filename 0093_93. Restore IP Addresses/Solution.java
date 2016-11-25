public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<String>();
        if(s.length() < 4){
            return list;
        }
        
        this.dfsFind(list, new ArrayList<String>(), s, 0);
        return list;
    }
    
    public void dfsFind(List<String> list, ArrayList<String> current, String remain, int step){
        if(step == 4){
            if(remain.length() == 0){
                String str = "";
                for(int i = 0; i < current.size(); i++){
                    str += current.get(i);
                    if(i < current.size() - 1){
                        str += ".";
                    }
                }
                list.add(str);
            }
            return;
        }
        
        if(remain.length() >= 1){
            String x = remain.substring(0, 1);
            current.add(x);
            this.dfsFind(list, current, remain.substring(1), step + 1);
            current.remove(current.size() - 1);
        }
        if(remain.length() >= 2){
            String x = remain.substring(0, 2);
            int xInt = Integer.parseInt(x);
            if(xInt >= 10){
                current.add(x);
                this.dfsFind(list, current, remain.substring(2), step + 1);
                current.remove(current.size() - 1);
            }
        }
        if(remain.length() >= 3){
            String x = remain.substring(0, 3);
            int xInt = Integer.parseInt(x);
            if(xInt >= 100 && xInt <= 255){
                current.add(x);
                this.dfsFind(list, current, remain.substring(3), step + 1);
                current.remove(current.size() - 1);
            }
        }
        
    }
}
