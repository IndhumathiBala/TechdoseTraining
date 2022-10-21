// 2271.https://leetcode.com/problems/maximum-white-tiles-covered-by-a-carpet/

class Solution {
    public int maximumWhiteTiles(int[][] tiles, int carpetLen) {
        int n=tiles.length,res=0,covered=0,partial=0;
        Arrays.sort(tiles,(a,b)->a[0]-b[0]);
        int start=0;
        for(int end=0;end<n && res<carpetLen;)
        {
            if(tiles[start][0]+carpetLen>tiles[end][1])
            {
                covered+=Math.min(carpetLen,tiles[end][1]-tiles[end][0]+1);
                res=Math.max(res,covered);
                end++;
            }
            else
            {
                partial=Math.max(0,tiles[start][0]+carpetLen-tiles[end][0]);
                res=Math.max(res,covered+partial);
                covered-=tiles[start][1]-tiles[start][0]+1;
                start++;
            }
        }
        return res;
    }
}
