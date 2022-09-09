import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(int i=0;i<n-1;i++)
	    {
	        boolean flag=false;
	        for(int j=0;j<n-1-i;j++)
	        {
	            if(arr[j]>arr[j+1])
	            {
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	                flag=true;
	            }
	        }
	        if(!flag)
	        {
	            break;
	        }
    	    }
    	    for(int i:arr)
    	    {
    	        System.out.print(i+" ");
    	    }
	}
}
