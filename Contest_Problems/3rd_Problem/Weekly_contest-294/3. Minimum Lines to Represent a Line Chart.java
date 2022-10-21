
 //2280.Minimum Lines to Represent a Line Chart
class Solution {
    public int minimumLines(int[][] stockPrices) {
        int n=stockPrices.length,lines=1;
        if(n==1)
            return 0;
        Arrays.sort(stockPrices,(a,b)->a[0]-b[0]);
        int day=stockPrices[1][0]-stockPrices[0][0];
        int prices=stockPrices[1][1]-stockPrices[0][1];
        for(int i=2;i<n;i++)
        {
          int tempD=stockPrices[i][0]-stockPrices[i-1][0];
           int tempP=stockPrices[i][1]-stockPrices[i-1][1];
            if((tempD!=day||tempP!=prices)&&(tempP*day!=tempD*prices))
            {
                lines++;
                day=tempD;
                prices=tempP;
            }
        }
        return lines;
            
    }
}
