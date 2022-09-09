import java.util.Scanner;
public class Main
{
    static void insertionSort(int arr[],int n)
    {
        for(int i=1;i<n;i++)
        {
            int x=arr[i],j=i-1;
            while(j>=0 && arr[j]>x)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=x;
        }
    }
	public static void main(String[] args) {
	    Scanner  sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[]arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    insertionSort(arr,n);
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	}
}
