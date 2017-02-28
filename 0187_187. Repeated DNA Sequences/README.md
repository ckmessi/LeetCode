### 187. Repeated DNA Sequences

All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.

For example,

Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",

Return:
["AAAAACCCCC", "CCCCCAAAAA"].

* * *

给定一个DNA序列，找出其中重复的长度为10的子串。   
这个使用哈希表记录没问题，关键是不能用String作为Key来保存，这样会超内存，需要使用编码的方式，将AGCT进行编码，这样每个长度为10的子串都能用一个32位整数来表示。   

