### 264. Ugly Number II

Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.

Note that 1 is typically treated as an ugly number, and n does not exceed 1690.

* * *

找出第n个丑数。   
由于丑数要求的因子是2、3、5，可以从小开始，控制2，3，5因子的数量，不断找出当前是由2，3，5构成的、大于当前丑数、但又是最小的下一个数，就是下一个丑数。  

