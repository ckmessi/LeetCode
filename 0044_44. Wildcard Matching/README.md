### 44. Wildcard Matching

Implement wildcard pattern matching with support for '?' and '*'.

'?' Matches any single character.    
'*' Matches any sequence of characters (including the empty sequence)    .

The matching should cover the entire input string (not partial).

The function prototype should be:    
bool isMatch(const char *s, const char *p)    

Some examples:    
isMatch("aa","a") → false     
isMatch("aa","aa") → true    
isMatch("aaa","aa") → false    
isMatch("aa", "*") → true    
isMatch("aa", "a*") → true    
isMatch("ab", "?*") → true    
isMatch("aab", "c*a*b") → false   

* * * 

判断一个字符模式是否匹配，比较好的是这个规则只和当前字符相关，就不用判断前一个字符的内容。    
使用简单的动态规划即可。    


