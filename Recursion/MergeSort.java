import java.util.*;
class MergeSort
{
    public static void main(String[]args)
    {
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
            System.out.print(arr[i]+" ");
        }
    }
    static void merge(int []arr,int low,int mid,int high)
    {
        int []temp=new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                temp[k++]=arr[i++];
            }
            else
            temp[k++]=arr[j++];
        }
        while(i<=mid)
        {
            temp[k++]=arr[i++];
        }
        while(j<=high)
        {
            temp[k++]=arr[j++];
        }
        for(int l=low,ind=0;l<=high;l++,ind++)
        {
                arr[l]=temp[ind];
        }
    }
    static void mergeSort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int mid=low+(high-low)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
}