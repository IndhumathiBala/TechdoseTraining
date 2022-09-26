import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int res=binarySearch(arr,k,n);
        System.out.println(res);
    }
    static int binarySearch(int arr[],int k,int n)
    {
        int res=0,sum=0,max=-1;
        for(int i=0;i<n;i++)
        {
            max=arr[i]>max?arr[i]:max;
            sum+=arr[i];
        }
        if(k==1)
        return sum;
        else if(k==n)
        return max;
        int low=max,high=sum;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(checkWorkers(arr,k,mid,n))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    static boolean checkWorkers(int arr[],int k,int mid,int n)
    {
        int sum=0,workers=1;
        for(int i=0;i<n;i++)
        {
            if(sum+arr[i]<=mid)
            {
                sum+=arr[i];
                
            }
            else
            {
                sum=arr[i];
                workers++;
            }
        }
        return workers<=k;
    }
}

