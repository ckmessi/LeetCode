### 166. Fraction to Recurring Decimal

Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

If the fractional part is repeating, enclose the repeating part in parentheses.

For example,

Given numerator = 1, denominator = 2, return "0.5".
Given numerator = 2, denominator = 1, return "2".
Given numerator = 2, denominator = 3, return "0.(6)".
Hint:

No scary math, just apply elementary math knowledge. Still remember how to perform a long division?
Try a long division on 4/9, the repeating part is obvious. Now try 4/333. Do you see a pattern?
Be wary of edge cases! List out as many test cases as you can think of and test your code thoroughly.

* * *

给定两个整数，要求得到除法结果，表示方法像小学时候学的一样，可以显示循环小数的。   
基本思路就是按照小学求解过程一步步进行即可，使用一个哈希表保存除法过程中出现的被除数，如果发现重复，说明有循环小数产生。  

