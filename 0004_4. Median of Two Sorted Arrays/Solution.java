public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        double res = 0;
        if((len1 + len2) % 2 == 1){
            res = (double)this.findKth(nums1, 0, nums2, 0, (len1 + len2) / 2 + 1);
        }
        else{
            res = (double)(this.findKth(nums1, 0, nums2, 0, (len1 + len2) / 2) + this.findKth(nums1, 0, nums2, 0, (len1 + len2) / 2 + 1)) / 2;
        }
        
        return res;
           
    }
    public int findKth(int[] nums1, int start1, int[] nums2, int start2, int k){
        if(nums1.length - start1 > nums2.length - start2){
            return this.findKth(nums2, start2, nums1, start1, k);
        }
        
        if(start1 == nums1.length){
            return nums2[start2 + k - 1];
        }
        if(k == 1){
            return Math.min(nums1[start1], nums2[start2]);
        }
        
        int pa = Math.min(nums1.length - start1, k / 2);
        int pb = k - pa;
        
        if(nums1[start1 + pa - 1] > nums2[start2 + pb - 1]){
            return this.findKth(nums1, start1, nums2, start2 + pb, k - pb);
        }
        else if (nums1[start1 + pa - 1] == nums2[start2 + pb - 1]){
            return nums1[start1 + pa - 1];
        }
        else{
            return this.findKth(nums1, start1 + pa, nums2, start2, k - pa);
        }
        
    }
}
