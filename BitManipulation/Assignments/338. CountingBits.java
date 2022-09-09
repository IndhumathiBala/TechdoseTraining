class Solution {
    public int[] countBits(int n) {
        int []arr=new int[n+1];int ind=0;
        for(int i=0;i<=n;i++)
        {
            // int t=i,count=0;
            // while(t!=0)
            // {
            //     count+=1;
            //     t=(t&(t-1));
            // }
            // arr[ind++]=count;
            arr[ind++]=Integer.bitCount(i);
        }
        return arr;
    }
}
