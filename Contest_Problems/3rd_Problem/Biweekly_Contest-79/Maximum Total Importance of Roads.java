
// 2285.https://leetcode.com/problems/maximum-total-importance-of-roads/

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long []arr=new long[n];
        for(int i[]:roads)
        {
            arr[i[0]]++;
            arr[i[1]]++;
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=(i+1)*arr[i];
        }
        return ans;
    }
}
