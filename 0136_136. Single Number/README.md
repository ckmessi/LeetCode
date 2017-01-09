### 136. Single Number
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

* * *

在一堆成对数组中找到single的那一个。（现在看到single总感觉有讽刺意味……）    
这道题目很经典，可以使用位运算异或进行，因为：    

* 0^x = x    
* x^x = 0    

这样就能找到single的那个元素。   

