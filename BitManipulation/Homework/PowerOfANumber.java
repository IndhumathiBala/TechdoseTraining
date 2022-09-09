import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int base=sc.nextInt();
	    int power=sc.nextInt();
	    int res=1;
	    while(power>0)
	    {
	        if((power&1)==1)
	        {
	            
	            res*=base;
	        }
	        base*=base;
	        power/=2;
	    }
	    System.out.println(res);
	    
	}
}
