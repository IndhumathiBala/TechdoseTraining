
class Solution {
    public boolean isRobotBounded(String instructions) {
        Map<Character,char[]>map=new HashMap<>(){
            {
                put('N',new char[]{'W','E'});
                 put('S',new char[]{'E','W'});
                 put('W',new char[]{'S','N'});
                 put('E',new char[]{'N','S'});
            }
        };
        Map<Character,int[]>moves=new HashMap<>(){
            {
                put('N',new int[]{0,1});
                put('W',new int[]{-1,0});
                put('S',new int[]{0,-1});
                put('E',new int[]{1,0});
            }
        };
        int i=0,j=0;
        char facing='N';
        for(char c:instructions.toCharArray())
        {
                if(c=='L')
                {
                    facing=map.get(facing)[0];
                }
                else if(c=='R')
                {
                    facing=map.get(facing)[1];
                }
                else
                {
                    i+=moves.get(facing)[0];
                    j+=moves.get(facing)[1];
                }
        }
        if(i==0 && j==0)
            return true;
        
        return facing!='N';
        
    }
}
