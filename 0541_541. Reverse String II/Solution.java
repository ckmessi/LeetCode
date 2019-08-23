/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */
class Solution {
    public String reverseStr(String s, int k) {
        int pos = 0;
        char[] charList = s.toCharArray();
        while(pos < charList.length){
            int end = Math.min(pos + k, charList.length);
            for(int i = pos, j = end - 1; i < j; i++, j--){
                char c = charList[i];
                charList[i] = charList[j];
                charList[j] = c;
            }
            pos += 2 * k;
        }
        return String.valueOf(charList);
    }
}


