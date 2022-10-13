
// 2381.https://leetcode.com/problems/shifting-letters-ii/

class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int []arr=new int[s.length()];
        for(int i=0;i<shifts.length;i++)
        {
           int start=shifts[i][0],end=shifts[i][1],c=shifts[i][2];
//            update start value and end+1 th value
//             so that during finding cumulative sum it will lead to crt soln
            arr[start]+=c==0?-1:1;          
            if(end+1<arr.length)
            {
                arr[end+1]+=(c==0)?1:-1;
            }
        }
        int z[]=new int[s.length()];//cumulative sum
        z[0]=arr[0];
        for(int i=1;i<s.length();i++)
        {
            z[i] = z[i-1] + arr[i];
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int n=((ch-'a'+z[i])%26)+'a';
            if(n<97)
            {
                n+=26;
            }
            sb.append((char)n);
        }
        return sb.toString();
    }
}
