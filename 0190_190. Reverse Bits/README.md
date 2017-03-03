### 190. Reverse Bits

Reverse bits of a given 32 bits unsigned integer.

For example, given input 43261596 (represented in binary as 00000010100101000001111010011100), return 964176192 (represented in binary as 00111001011110000010100101000000).

Follow up:
If this function is called many times, how would you optimize it?

Related problem: Reverse Integer

* * *

给定一个32位无符号整数，要求把它按位逆转一下。   
最简单的方法就是从右到左遍历这个整数的32位，每一位作为结果从左到右累计。   


