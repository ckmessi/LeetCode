class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> greaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < nums2.length; i++){
            if(i == 0){
                stack.push(nums2[i]);
            }
            else{
                while(stack.isEmpty() == false){
                    int target = stack.peek();
                    if(target < nums2[i]) {
                        stack.pop();
                        greaterMap.put(target, nums2[i]);
                    }
                    else{
                        break;
                    }
                }
                stack.push(nums2[i]);
            }
        }

        int[] result = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            result[i] = greaterMap.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
