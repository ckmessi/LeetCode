### 201. Bitwise AND of Numbers Range

Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive.

For example, given the range [5, 7], you should return 4.

* * *

与其说这一是道编程题，倒不如说是一道数学题，或智力题。   
找到题目所说范围内所有数字的AND结果，由于m和n肯定从某一位开始不同，那位后面肯定有0，所以后面肯定全都是0，而m和n相同的高位，就是这个结果。   

因此思路是将m和n右移直至两者相等，记录位移的位数后，将它移回去，返回即可。   


