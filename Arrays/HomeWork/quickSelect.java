import java.util.*;
public class Main
{
    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high],i=low;
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
                i++;
            }
        }
        int t=arr[high];
        arr[high]=arr[i];
        arr[i]=t;
        return i;
    }
    static int quickSelect(int arr[],int low,int high,int k)
    {
        int partition=partition(arr,0,high);
        if(partition==k-1)
        {
            return arr[partition];
        }
        else if(partition<k-1)
        {
            return quickSelect(arr,partition+1,high,k);
        }
        else{
            return quickSelect(arr,low,partition-1,k);
        }
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
	    System.out.println(quickSelect(arr,0,n-1,k));
	}
}
