class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        int car[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            car[i][0]=position[i];
            car[i][1]=speed[i];
        }
        Arrays.sort(car,(a,b)->a[0]-b[0]);
        Stack<Double>mono=new Stack<>();
        //monotonically decreasing stack
        for(int i=0;i<n;i++)
        {
            double time=(target-car[i][0])/(double)car[i][1];
            while(!mono.isEmpty() && mono.peek()<=time)
            {
                mono.pop();
            }
            mono.push(time);
            
        }
        return mono.size();
    }
}
