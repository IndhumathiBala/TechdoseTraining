//Problem link:  https://leetcode.com/contest/biweekly-contest-88/problems/bitwise-xor-of-all-pairings/

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int x1=0,x2=0;
        for(int x:nums1)
        {
            x1^=x;
        }
        for(int x:nums2)
        {
            x2^=x;
        }
        int res=0;
        if(nums1.length%2!=0)
        {
            res^=x2;
        }
        if(nums2.length%2!=0)
        {
            res^=x1;
        }
        return res;
    }
}
