public class Solution {
    
    private String[] LESS_THAN_20 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        
        if(num == 0){
            return "Zero";
        }
        
        int i = 0;
        String words = "";
        while(num > 0){
            if(num % 1000 != 0){
                words = this.getNumberWord(num % 1000) + THOUSANDS[i] + " " + words;
            }
            num /= 1000;
            i++;
        }
        
        return words.trim();
        
    }
    public String getNumberWord(int num){
        if (num == 0)
            return "";
        else if (num < 20)
            return LESS_THAN_20[num] + " ";
        else if (num < 100)
            return TENS[num / 10] + " " + this.getNumberWord(num % 10);
        else
            return LESS_THAN_20[num / 100] + " Hundred " + this.getNumberWord(num % 100);
        }
}
