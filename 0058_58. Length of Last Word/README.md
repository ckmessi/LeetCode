### 58. Length of Last Word

Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

For example,     
Given s = "Hello World",    
return 5.    

* * *

从后向前找，找到第一个非空格字符作为结束字符。然后再向前找，找到第一个空格字符（或-1）作为起始字符。返回结束字符和起始字符的位置之差。   


