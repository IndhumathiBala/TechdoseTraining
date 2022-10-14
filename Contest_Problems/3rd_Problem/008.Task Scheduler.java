// 2365. https://leetcode.com/contest/biweekly-contest-84/problems/task-scheduler-ii/

class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        long day=1;
        Map<Integer,Long>map=new LinkedHashMap<>();
        for(int i:tasks)
        {
            if(map.containsKey(i))
            {
                long lastDone=map.get(i);
                day=Math.max(day,space+lastDone+1);
                
            }
            map.put(i,day);
            day++;
        }
       return day;
        
    }
}
