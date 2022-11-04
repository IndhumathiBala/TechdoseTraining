class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        recurPermute(0,nums,list);
        return list;
    }
    public void recurPermute(int ind,int []nums,List<List<Integer>>list)
    {
        if(ind==nums.length)
        {
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                l.add(nums[i]);
            }
            list.add(l);
        }
        for(int i=ind;i<nums.length;i++)
        {
            swap(i,ind,nums);
            recurPermute(ind+1,nums,list);
            swap(i,ind,nums);
        }
        
    }
    public void swap(int i,int j,int []nums)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
