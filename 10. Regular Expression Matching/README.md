### 10. Regular Expression Matching

Implement regular expression matching with support for '.' and '\*'.

	'.' Matches any single character.    
	'\*' Matches zero or more of the preceding element.

	The matching should cover the entire input string (not partial).

	The function prototype should be:
	bool isMatch(const char *s, const char *p)

	Some examples:
	isMatch("aa","a") → false
	isMatch("aa","aa") → true
	isMatch("aaa","aa") → false
	isMatch("aa", "a*") → true
	isMatch("aa", ".*") → true
	isMatch("ab", ".*") → true
	isMatch("aab", "c*a*b") → true

* * *

判断字符串s是否匹配正则表达式p。   
基本思路是动态规划，但是中间有一些步骤需要额外考虑。   

	// match[i][j]表示s(1,i)匹配p(1,j)    
        // match[0][0] = true    
        // match[i][0] = false, match[0][j] = match[0][j-2] && p[j] == '*'    
        // p[j] == '*', match[i][j] =     
            //  如果p[j-1] == '.', match[k][j-2] == true即可（0<=k<=i）    
            //  否则，要么match[i][j-2] == true，要么match[k-1][j-2] == true && s[k~i] == p[j-1]    
        // p[j] == '.', match[i][j] = match[i-1][j-1]    
        // p[j] == others, match[i][j] == match[i-1][j-1] && s[i] == p[j]    


