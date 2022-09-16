class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start=intervals[0][0],end=intervals[0][1];
        List<int[]>res=new ArrayList<>();
        for(int [] i:intervals)
        {
            if(end>=i[0])
            {
                end=Math.max(end,i[1]);
            }
            else
            {
              res.add(new int[]{start,end});
              start=i[0];end=i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[res.size()][]);
        
    }
}
