import java.util.*;
public class Main
{
    static void merge(int []arr,int start,int mid,int midPlusOne,int high)
    {
        int temp[]=new int[51];
        int i=start,j=midPlusOne,k=0;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=high)
        {
            temp[k++]=arr[j++];
        }
        for(i=start,j=0;i<=high;i++,j++)
        {
            arr[i]=temp[j];
        }
    }
    static void mergeSort(int []arr,int i,int j)
    {
        int mid;
        if(i<j)
        {
            mid=(i+j)/2;
            mergeSort(arr,i,mid);
            mergeSort(arr,mid+1,j);
            merge(arr,i,mid,mid+1,j);
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    mergeSort(arr,0,n-1);
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i] + " ");
	    }
	}
}
