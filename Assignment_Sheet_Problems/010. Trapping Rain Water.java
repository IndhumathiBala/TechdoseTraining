class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n<=2)
            return 0;
        int water=0,maxLeft=0,maxRight=0;
        int left[]=new int[n],right[]=new int[n];
        for(int i=0;i<n;i++)
        {
            left[i]=maxLeft;
            maxLeft=Math.max(maxLeft,height[i]);
            System.out.print(left[i]+" ");
        }
        System.out.println();
        for(int i=n-1;i>=0;i--)
        {
            right[i]=maxRight;
            maxRight=Math.max(maxRight,height[i]);
            System.out.print(left[i]+" ");
        }
        for(int i=1;i<n-1;i++)
        {
            if(Math.min(left[i],right[i])-height[i]>0)
                water+=Math.min(left[i],right[i])-height[i];
        }
        return water;
        
    }
}
