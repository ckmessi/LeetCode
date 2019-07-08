class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String[] array = S.split("-");
        List<String> strList = new ArrayList<>();
        String totalStr = String.join("", array);
        while(totalStr.length() > 0){
            if(totalStr.length() >= K){
                strList.add(0, totalStr.substring(totalStr.length() - K));
                totalStr = totalStr.substring(0, totalStr.length() - K);
            }
            else{
                strList.add(0, totalStr);
                totalStr = "";
            }
        }
        String result = String.join("-", strList.toArray(new String[strList.size()]));
        return result.toUpperCase();        
    }
}
