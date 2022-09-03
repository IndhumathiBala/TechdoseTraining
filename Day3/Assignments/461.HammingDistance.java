import java.util.*;
public class Main
{
    public static int hammingDistance(int x, int y) {
        long k=x^y;
        int c=0;
        for(long i=1;i<=k;i<<=1)
        {
            if((k&i)!=0)
                c++;
        }
        return c;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int x=sc.nextInt();
           int y=sc.nextInt();
           System.out.println(hammingDistance(x,y));
	}
}
