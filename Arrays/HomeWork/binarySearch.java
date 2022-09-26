import java.util.*;
public class Main
{
    static int binarySearch(int arr[],int low,int high,int k )
    {
         if(low<high)
         {
             int mid=low+(high-low/2);
             if(arr[mid]==k)
             return mid;
             else if(arr[mid]<k)
             {
                 return binarySearch(arr,mid+1,high,k);
             }
             else 
             {
                 return binarySearch(arr,0,mid-1,k);
             }
         }
         return -1;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int k=sc.nextInt();
	    int res=binarySearch(arr,0,n-1,k);
	    if(res!=-1)
	    {
	        System.out.println("Element found at index "+res);
	    }
	    else
	    {
	        System.out.println("Element not found");
	    }
	}
}
