### 31. Next Permutation

Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be in-place, do not allocate extra memory.

Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.    
1,2,3 → 1,3,2    
3,2,1 → 1,2,3    
1,1,5 → 1,5,1    

* * *

寻找当前排列数的下一个排列。    
这是一个数学逻辑问题，朴素的思路是分为三步：    
1. 从右到左，寻找第一个满足比右侧数小的数的位置pos。
2. 从右到左，寻找在pos右边，满足比nums[pos]的值大，但在所有右侧数中值最小的数的位置target，交换pos和target的数值。
3. 将右侧的数逆序。   


