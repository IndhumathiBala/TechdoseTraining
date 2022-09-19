import java.util.*;

// Time Complexity	 
// Best	==> O(n+k)
// Worst	==> O(n+k)
// Average	==> O(n+k)
// Space Complexity ==>	O(max)
// Stability	==> Yes



class Main
{
    static void countSort(int []arr,int base,int n)
    {
        int count[]=new int[10];
        Arrays.fill(count,0);
        int []temp=new int[n];
        for(int i=0;i<n;i++)
        {
            count[(arr[i]/base)%10]++;
        }
        for(int i=1;i<10;i++)
        {
            count[i]+=count[i-1];
        }
        // transferring elements to temp array
        for(int i=n-1;i>=0;i--)
        {
            temp[count[(arr[i]/base)%10]-1]=arr[i];
            count[(arr[i]/base)%10]--;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
    }
    static void radixSort(int []arr,int max,int n)
    {
        for(int i=1;max/i>0;i*=10)
        {
            countSort(arr,i,n);
        }
    }
    
    static int findMax(int []arr,int n)
    {
        int max=-1;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=findMax(arr,n);
        radixSort(arr,max,n);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
