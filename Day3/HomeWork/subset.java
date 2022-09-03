import java.util.*;
public class Main
{
    static List<List<Integer>> findSubset(int []arr,int n)
    {
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<(1<<n);i++)
        {
            List<Integer>l=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                if((i&(1<<j))!=0)
                {
                 l.add(arr[j]);
                }
            }
            list.add(new ArrayList<>(l));
        }
        return list;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           int []arr=new int[n];
           for(int i=0;i<n;i++)
           {
               arr[i]=sc.nextInt();
            }
            List<List<Integer>>list=findSubset(arr,n);
            for(int i=0;i<list.size();i++)
            {
                for(int j=0;j<list.get(i).size();j++)
                {
                    System.out.print(list.get(i).get(j)+" ");
                }
                System.out.println();
            }
            //  for(List<Integer>l:list)
            // {
            //     for(Integer k:l)
            //     {
            //         System.out.print(k+" ");
            //     }
            //     System.out.println();
            // }
	}
}
