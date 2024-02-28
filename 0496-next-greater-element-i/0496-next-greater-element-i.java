class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        for(int n:nums2){
            while(!stack.isEmpty() && stack.peek()<n){
                map.put(stack.pop(),n);
            }
            stack.push(n);
       }

        int[] res = new int[nums1.length];
        for(int i = 0;i<res.length;i++){
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}