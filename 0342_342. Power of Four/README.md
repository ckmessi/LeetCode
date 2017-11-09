### 342. Power of Four

Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?

* * *

给定一个32位有符号整数，判断是否是4的幂次。   
首先判断是否大于0；然后通过`n & (n-1) == 0`确认是2的幂次；然后通过`n & 0x55555555 != 0`排除那些仅是2的幂次不是4的幂次的数。   

