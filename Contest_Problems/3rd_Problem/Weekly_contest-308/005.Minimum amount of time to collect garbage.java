
// 2391.https://leetcode.com/contest/weekly-contest-308/problems/minimum-amount-of-time-to-collect-garbage/
class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int [][]arr=new int[3][garbage.length];
        int n=garbage.length;
        for(int i=0;i<garbage.length;i++)
        {
              for(int j=0;j<garbage[i].length();j++)
              {
                  char ch=garbage[i].charAt(j);
                  if(ch=='P')
                  {
                      arr[0][i]++;
                  }
                  else if(ch=='G')
                  {
                      arr[1][i]++;
                  }
                  else
                  {
                      arr[2][i]++;
                  }
              }
        }
        int j=n-1,paper=0,glass=0,metal=0;
        paper+=findGarbage(j,travel,arr,0);
        glass+=findGarbage(j,travel,arr,1);
        metal+=findGarbage(j,travel,arr,2);
        return paper+glass+metal;
        
    }
    static int findGarbage(int j,int travel[],int arr[][],int k)
    {
        int gar=0;
        while(j>=0 && arr[k][j]==0)
        {
            j--;
        }
        for(int i=0;i<=j;i++)
        {
            gar+=arr[k][i];
            if(i>0)
            gar+=travel[i-1];
        }
        return gar;
    }
}
