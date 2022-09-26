class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        int []arr=new int [m+n];
        int k=0,i1=0,i2=0;
        while(i1<m && i2<n)
        {
            if(nums1[i1]<nums2[i2])
            {
                arr[k++]=nums1[i1++];
            }
            else
            {
                arr[k++]=nums2[i2++];
            }
        }
        while(i1<m)
        {
            arr[k++]=nums1[i1++];
        }
        while(i2<n)
        {
            arr[k++]=nums2[i2++];
        }
        double res=0.0;
        if((m+n)%2!=0)
        {
            res=arr[(m+n)/2];
        }
        else
        {
            res=(arr[(m+n)/2-1]+arr[(m+n)/2])/2.0;
        }
        return res;
    }
}
