import java.util.*;
class Possible_Subsets{
    static List<String>res=new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        findPermutation(s,0,"");
        for(String k:res)
        {
            System.out.println(k);
        }
    }
    static void findPermutation(String s,int n,String st)
    {
        if(n==s.length())
        {
            res.add(st);
            return;
        }
        findPermutation(s,n+1,st);//exclude
        st+=""+s.charAt(n);
        findPermutation(s,n+1,st);//include
    }
}