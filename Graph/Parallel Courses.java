You are given an integer n, which indicates that there are n courses labeled from 1 to n.
You are also given an array relations where relations[i] = [prevCoursei, nextCoursei], representing a prerequisite 
relationship between course prevCoursei and course nextCoursei: course prevCoursei has to be taken before course nextCoursei.

In one semester, you can take any number of courses as long as you have taken all the prerequisites in the previous semester for the courses you are taking.

Return the minimum number of semesters needed to take all courses. If there is no way to take all the courses, return -1.
Input: n = 3, relations = [[1,3],[2,3]]
Output: 2

Input: n = 3, relations = [[1,2],[2,3],[3,1]]
Output: -1



class Solution {
    public int minimumSemesters(int n, int[][] relations) {
        int []indegree=new int[n+1];
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i[]:relations)
        {
            adj.get(i[0]).add(i[1]);
            indegree[i[1]]++;
        }
        return findCount(adj,indegree,n);
        
    }
    int findCount(List<List<Integer>>adj,int[]indegree,int n)
    {
        int sem=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }

        while(!q.isEmpty())
        {
            int size=q.size();
            n--;
            while(size-->0)
            {
                int node=q.poll();
                for(int it:adj.get(node))
                {
                    indegree[it]--;
                    if(indegree[it]==0)
                    {
                        q.add(it);
                    }
                }
            }
            sem++;
        }
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]!=0)
            {
                return -1;
            }
        }
        return sem;
    }
}
