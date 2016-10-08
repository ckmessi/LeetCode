### 49. Group Anagrams

Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 

Return:

	[    
	  ["ate", "eat","tea"],    
	  ["nat","tan"],    
	  ["bat"]    
	]    

Note: All inputs will be in lower-case.

* * *

给定一个字符串数组，要求把同字符短语分组放好。   
使用一个哈希表，针对每种同字符短语构建对应的列表。遍历字符串数组，找到对应位置添加即可。    

