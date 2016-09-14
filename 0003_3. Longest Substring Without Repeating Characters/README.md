### 3. Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.

* * * 
给定一个字符串，求不包含重复字符的最长子串。   
其实就是用哈希表记录，从左到右遍历，不断更新有效的左侧位置。   


