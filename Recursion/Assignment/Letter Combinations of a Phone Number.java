class Solution {
    
    final static HashMap<Character,String> map=new HashMap<>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
    }};
	
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>(); 
        if(digits.length()==0) return ans;
        backtrack(0,digits,new StringBuilder(),ans);
        return ans;
    }
    static void backtrack(int dig,String digits,StringBuilder temp,List<String> ans){
        if(dig==digits.length())
        {
            ans.add(temp.toString());
            return;
        }
        String y=map.get(digits.charAt(dig));
        for(int i=0;i<y.length();i++)
        {
            char c=y.charAt(i);
            temp.append(c);
            backtrack(dig+1,digits,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }
    } 
}
