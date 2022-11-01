import java.util.*;
class String_Permutation
{
    static List<String>res=new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        permute(s,"");
        for(String k:res)
        {
            System.out.println(k);
        }
    }
    static void permute(String s,String st)
    {
        if(s.equals(""))
        {
            res.add(st);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);//rest of string
            permute(ros,st+ch);
        }

    }
}