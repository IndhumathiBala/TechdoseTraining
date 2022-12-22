class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int diff[]=new int[length];
        for(int i[]:updates)
        {
            diff[i[0]]+=i[2];
            if(i[1]+1<length)
            {
                diff[i[1]+1]-=i[2];
            }
        }
        for(int i=1;i<length;i++)
        {
            diff[i]+=diff[i-1];
        }
        return diff;
    }
}
