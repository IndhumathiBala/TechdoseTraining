import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Map<Integer,Integer>map=new HashMap<>();
	    List<Integer>list=new ArrayList<>();
	    int n=sc.nextInt();
	    int []arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
	    }
	    int k=sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        if(map.get(arr[i])>=n/k)
	        {
	            list.add(arr[i]);
	            map.replace(arr[i],-1);
	        }
	    }
	    list.forEach(x->System.out.println(x));
	}
}
