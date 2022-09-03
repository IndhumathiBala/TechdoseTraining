import java.util.*;
public class Main
{
    static int leastPowerOf2(int n)
    {
        while((n>0&&(n&(n-1))>0))
        {
        n=n&(n-1);
        }
        return n;
        // int ctr=0;
        // while(n!=1)
        // {
        //     n>>=1;
        //     ctr++;
        // }
        // return 1<<ctr;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           System.out.println(leastPowerOf2(n));
	}
}
