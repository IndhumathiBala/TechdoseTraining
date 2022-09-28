class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n<=2)
            return 0;
        int water=0,left=height[0],right=height[n-1],l=0,r=n-1;
        while(l<r)
        {
            if(left<=right)
            {
                water+=left-height[l]>0?left-height[l]:0;
                left=Math.max(left,height[++l]);
                
            }
            else
            {
                water+=(right-height[r])>0?right-height[r]:0;
                right=Math.max(right,height[--r]);
                
            }
        }
        return water;
        
    }
}
