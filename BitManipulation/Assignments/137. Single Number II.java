
import java.util.*;
public class Main
{
	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int []arr=new int[n];
           int ans=0,ctr=0;
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
           }
           for(int i=0;i<=31;i++)
           {
               ctr=0;
               for(int j:arr)
               {
                   if((j&(1<<i))!=0)
                   ctr++;
               }
               if(ctr%3!=0)
               ans|=(1<<i);
           }
           System.out.println(ans);
	}
}
