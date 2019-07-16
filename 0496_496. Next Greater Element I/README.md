### 496. Next Greater Element I

You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.

The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2].
Output: [-1,3,-1]
Explanation:
    For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
    For number 1 in the first array, the next greater number for it in the second array is 3.
    For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
Example 2:
Input: nums1 = [2,4], nums2 = [1,2,3,4].
Output: [3,-1]
Explanation:
    For number 2 in the first array, the next greater number for it in the second array is 3.
    For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
Note:
All elements in nums1 and nums2 are unique.
The length of both nums1 and nums2 would not exceed 1000.

* * *

给定两个各自不包含重复元素的数组，其中 nums1 是 nums2 的子集（即 nums1 中的元素在 nums2 中一定存在，且位置唯一），要求给出对于 nums1 各个元素的右边较大元素。

针对 nums2 ，用一个栈记录当前出现的元素。来了一个新元素，与栈顶元素判断，如果比栈顶元素大，则可以移除栈顶元素并记录 `右边较大元素` 信息，然后继续比对；直到比栈顶元素小或栈为空，可以将新元素压入栈。
最后遍历 nums1，根据 `右边较大元素` 信息，就能够得到结果。 

