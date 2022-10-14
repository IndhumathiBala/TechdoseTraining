// 2406.https://leetcode.com/contest/weekly-contest-310/problems/divide-intervals-into-minimum-number-of-groups/


class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->(a[0] - b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int k[]:intervals)
        {
            for(int i:k)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < intervals.length; i++) {
            if (!pq.isEmpty() && intervals[i][0] > pq.peek()) {
                pq.poll();
            }
            pq.offer(intervals[i][1]);
        }
        return pq.size();
        
    }
}
