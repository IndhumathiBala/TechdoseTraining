import java.util.*;
public class Main
{
    static void swap(int i,int j,int arr[])
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
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
	        int minIdx=i;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[j]<arr[minIdx])
	            {
	                minIdx=j;
	            }
	        }
	        swap(i,minIdx,arr);
    	    }
    	    for(int i:arr)
    	    {
    	        System.out.print(i+" ");
    	    }
	}
}
