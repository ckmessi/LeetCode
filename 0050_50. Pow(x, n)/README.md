### 50. Pow(x, n)

Implement pow(x, n).

* * * 

实现幂次运算。   
这个算法需要记住：求x^n，假设结果为res，那么当n%2==1时，res*=x；否则x*=x，n/=2。这样二分迭代即可。    
另外需要注意的地方有，n为负数的情况，以及，n为Integer.MIN_VALUE的情况，这时候简单地取反会导致错误。所以n需要使用long来保存。   

