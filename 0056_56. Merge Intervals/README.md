### 56. Merge Intervals

Given a collection of intervals, merge all overlapping intervals.

For example,    
Given [1,3],[2,6],[8,10],[15,18],     
return [1,6],[8,10],[15,18].    

* * * 

给定一个区间数组，要求把重复覆盖的部分合并。   
两步，首先将区间按照起始位置从小到大排序；然后逐个遍历，遇到当前起始比上个合并好区间终止位置还大的话，直接加入合并区间数组，否则将合并区间数组最后一个的终止位置进行更新。    


