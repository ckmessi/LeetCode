### 205. Isomorphic Strings

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.

* * * 

给定两个字符串s和t，判断它们是不是同形异构字符串。  
所谓同形异构，指的是将字符串s中的字符sc替换成sc\'，能够得到字符串t，反之亦然。   

简单的，使用哈希表进行记录即可。   

