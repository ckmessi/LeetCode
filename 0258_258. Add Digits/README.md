### 258. Add Digits

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

* * *

给定一个非负整数，重复把每一位所有数字加起来，直到只剩一位数。   
可以使用循环，比较直接的是使用数学公式。   
res = 1 + ((num - 1) % 9)

