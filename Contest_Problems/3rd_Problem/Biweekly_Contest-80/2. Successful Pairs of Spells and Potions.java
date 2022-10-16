// 2300.https://leetcode.com/problems/successful-pairs-of-spells-and-potions/
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int [] res=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            res[i]=countSuccess(spells[i],potions,success);
            
        }
        return res;
    }
    public int countSuccess(int spell,int []potions,long s)
    {
        int low=0,high=potions.length-1,count=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(spell*1L*potions[mid]>=s)
            {
                count=(potions.length-mid);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return count;
    }
}
