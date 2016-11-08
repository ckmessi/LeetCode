### 76. Minimum Window Substring

Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

For example,    
S = "ADOBECODEBANC"    
T = "ABC"    
Minimum window is "BANC".    

Note:   
If there is no such window in S that covers all characters in T, return the empty string "".

If there are multiple such windows, you are guaranteed that there will always be only one unique minimum window in S.

* * *

给定字符串S和T，求S中能够包含所有T字符的最短子串。   
使用双指针法不断移动。   


