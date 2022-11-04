class Solution {
    List<List<Integer>>res=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         combi(candidates,target,candidates.length,0,0,new ArrayList<>());
         return res;
    }
    void combi(int []nums,int goal,int n,int sum,int ind,List<Integer>ans)
    {
        if(sum>goal)
        {
            return ;
        }
        if(sum==goal)
        {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<n;i++)//from ind because we want unique combo
        {
            ans.add(nums[i]);
            combi(nums,goal,n,sum+nums[i],i,ans);
            ans.remove(ans.size()-1);
        }
    }
}
