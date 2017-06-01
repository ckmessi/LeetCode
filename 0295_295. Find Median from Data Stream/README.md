### 295. Find Median from Data Stream

Median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value. So the median is the mean of the two middle value.

Examples: 
[2,3,4] , the median is 3

[2,3], the median is (2 + 3) / 2 = 2.5

Design a data structure that supports the following two operations:

void addNum(int num) - Add a integer number from the data stream to the data structure.
double findMedian() - Return the median of all elements so far.
For example:

addNum(1)
addNum(2)
findMedian() -> 1.5
addNum(3) 
findMedian() -> 2

* * *

找一个数据流的中值。    
用两个优先队列，分别从小到大和从大到小放置目前的数据，且保持从小到大的队列数量始终不少于从大到小的队列。    
然后取值的时候取出队列尾部或者两队列尾部的值即可。   


