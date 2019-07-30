class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num <= 0){
            return false;
        }
        List<Integer> factorList = this.getAllFactors(num);
        int sum = factorList.stream().mapToInt(Integer::intValue).sum();
        return sum == num;       
        
    }
    
    private List<Integer> getAllFactors(int num) {
        List<Integer> list = new ArrayList<>();
        double sqrtOfNum = Math.sqrt(num * 1.0);
        list.add(1);
        for(int i = 2; i < sqrtOfNum; i++){
            if(num % i == 0) {
                list.add(i);
                list.add(num / i);
            }
        }
        if((int)sqrtOfNum * (int)sqrtOfNum == num){
            list.add((int)sqrtOfNum);
        }
        return list;
    }
}
