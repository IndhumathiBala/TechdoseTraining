class Solution{
    ArrayList <Integer> nearlySorted(int arr[], int num, int k)
    {
            if(arr.length==0)
            return new ArrayList<>();
            ArrayList<Integer>res=new ArrayList<>();
            PriorityQueue<Integer>q=new PriorityQueue<>();
            int min=Math.min(num,k+1);
            for(int i=0;i<min;i++)
            {
                q.add(arr[i]);
            }
            int index=0;
            for(int i=k+1;i<num;i++)
            {
                res.add(q.poll());
                q.add(arr[i]);
            }
            while(!q.isEmpty())
            {
                res.add(q.poll());
            }
            return res;
            
    }
}
