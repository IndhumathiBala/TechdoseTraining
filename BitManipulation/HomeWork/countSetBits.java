import java.util.*;
public class Main
{
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int count=0;
           for(int i=1;i<=n;i<<=1)
           {
            //   i=1-----i=2-----i=4-----i=8#
            if((n&i)!=0)
                count++;
           }
           System.out.println(count);
	}
}
