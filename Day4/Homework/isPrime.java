import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n==1)
	    {
	        System.out.println("Not a Prime");return;
	    }
	    for(int i=2;i*i<=n;i++)
	    {
	        if(n%i==0)
	        {
	            System.out.println("Not a prime");
	            return;
	        }
	    }
	    System.out.println("Given Number is Prime");
	}
}
