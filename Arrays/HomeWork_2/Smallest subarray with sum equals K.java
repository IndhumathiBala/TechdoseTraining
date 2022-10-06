import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt (),sum=0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
     	arr[i] = sc.nextInt ();
    }
    int k=sc.nextInt();
    Map<Integer,Integer>map=new LinkedHashMap<>();
    int min=Integer.MAX_VALUE;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
        if(sum==k)
        {
        min=Math.min(i+1,min);
        }
        map.put(sum,i);
        
        if(map.containsKey(sum-k))
        {
            min=min>i-map.get(sum-k)?i-map.get(sum-k):min;
        }
    }
    System.out.println(min);
  }
}
