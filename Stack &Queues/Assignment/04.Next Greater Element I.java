class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>stack=new Stack<>();
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
               while(!stack.isEmpty() && nums2[stack.peek()]<nums2[i])
               {
                    map.put(nums2[stack.pop()],nums2[i]);
               }
               stack.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(map.get(nums1[i])==null)
                nums1[i]=-1;
            else
            nums1[i]=map.get(nums1[i]);
        }
        return nums1;
    }
}
