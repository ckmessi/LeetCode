### 231. Power of Two

Given an integer, write a function to determine if it is a power of two.

* * *

给定一个整数，判断是否是2的幂次。   

根据位的性质可知，2的幂次等价于n & (n - 1) == 0。

需要注意有个坑是，如果n <= 0，要返回false。


