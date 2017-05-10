### 278. First Bad Version

You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.

* * *

给定一系列版本，有一个API能够返回当前版本是好还是坏。如果一个版本坏了，后缀版本肯定也是坏的。   
要求找出第一个坏掉的版本。   

最最朴素的二分查找。  


