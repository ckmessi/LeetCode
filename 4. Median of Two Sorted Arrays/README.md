### 4. Median of Two Sorted Arrays

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
	nums1 = [1, 3]    
	nums2 = [2]    

	The median is 2.0

Example 2:
	nums1 = [1, 2]    
	nums2 = [3, 4]     

	The median is (2 + 3)/2 = 2.5

* * *
给定两个有序数组，求中位数。    
使用一个辅助函数，查找两个有序数组的第k个数，然后使用分治的思想，在两个数组分别取k/2，比较大小，可以划走其中一半的数据。   


