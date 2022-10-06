import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt (),sum=0,max=0;
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
     	arr[i] = sc.nextInt ();
    }
    int k=sc.nextInt();
    Map<Integer,Integer>map=new LinkedHashMap<>();
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
        if(sum==k)
        max=i+1;
        if(!map.containsKey(sum))
        {
            map.put(sum,i);
        }
        if(map.containsKey(sum-k))
        {
            max=max<i-map.get(sum-k)?i-map.get(sum-k):max;
        }
    }
    System.out.println(max);
  }
}
