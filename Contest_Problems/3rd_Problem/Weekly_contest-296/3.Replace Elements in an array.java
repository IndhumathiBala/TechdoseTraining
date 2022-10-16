
// 2295.https://leetcode.com/problems/replace-elements-in-an-array/
class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        int[] f = new int[1000001];
        Arrays.fill(f, -1);
        int n = nums.length;
        for(int i = 0;i < n;i++){
            f[nums[i]] = i;
        }
        for(int[] o : operations){
            f[o[1]] = f[o[0]];
            f[o[0]] = -1;
        }
        for(int i = 0;i < 1000001;i++){
            if(f[i] >= 0){
                nums[f[i]] = i;
            }
        }
        return nums;
    }
}
