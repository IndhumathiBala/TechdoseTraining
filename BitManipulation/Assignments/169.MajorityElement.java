import java.util.*;
public class Main
{
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int []nums=new int[n];
           for(int i=0;i<n;i++)
           {
               nums[i]=sc.nextInt();
           }
            int max=nums[0],ctr=1;
            for(int i=1;i<nums.length;i++)
            {
                if(max==nums[i] )
                    ctr++;
                else
                    ctr--;
                if(ctr<0)
                {
                    max=nums[i];
                    ctr=0;
                }
            }
            System.out.println(max);
	}
}
