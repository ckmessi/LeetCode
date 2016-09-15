### 30. Substring with Concatenation of All Words
You are given a string, s, and a list of words, words, that are all of the same length. Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

For example, given:    
s: "barfoothefoobarman"    
words: ["foo", "bar"]    

You should return the indices: [0,9].    
(order does not matter).    


* * *

给定一个字符串s，和一组字符串。查找这样一个坐标x，满足从x开始后的字符串刚好出现字符串数组中所有字符串一次。返回所有满足的x的列表。

思路很朴素，就是用哈希表记录，然后逐个查找。   


