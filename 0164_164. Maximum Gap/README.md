### 164. Maximum Gap

Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

Try to solve it in linear time/space.

Return 0 if the array contains less than 2 elements.

You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.

* * *

要求在线性时间/空间复杂度内，找到无序数组中按顺序排放的最大间距。   
这个问题使用到了桶排序。  
基于假设，由于有n个元素，其中最大值max和最小值min，可推知最终结果maximumGap的值不小于(max - min) / (n - 1)。这是容易证明的，反证法如果最大间隔小于上述值，则min + (n-1) * maximumGap < max，与最大值是max矛盾。   
在这种前提下，我们可以把所有元素划分到n-1个桶里，其中每个桶内的间隔为(max-min)/(n-1)+1（plus 1是为了取上界）。这样所有桶内的元素间隔就不用考虑了，只需要考虑桶间的元素间隔。   
每个桶记录桶内最大值和最小值，然后遍历统计每个桶最小值和上一个桶最大值之间的间隔，其中的最大值就是最终结果。   


