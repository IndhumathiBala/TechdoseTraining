import java.util.*;
public class Main
{
    static int rightMostSetBitValue(int N)
    {
        return N&(~N+1);
    }
    static int rightMostSetBitPos(int n)
    {
        int pos=0;
        while((n&1)==0)
        {
            n>>=1;
            pos++;
        }
        return pos+1;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           System.out.println(rightMostSetBitValue(n));
           System.out.println(rightMostSetBitPos(n));
	}
}
