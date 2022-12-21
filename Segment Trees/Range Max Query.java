import java.util.*;
public class Main
{
    static int arr[]=new int[4];
    static int st[]=new int[4*arr.length];
    public static void build(int index,int start,int end)
    {
       if(start>end)
       {
           return ;
       }
       if(start==end)
       {
         st[index]=arr[start];
         return;
       }
       int mid=start+(end-start)/2;
       build(2*index+1,start,mid);
       build(2*index+2,mid+1,end);
       st[index]=Math.max(st[2*index+1],st[index*2+2]);
    }
    public static int query(int qs,int qe,int start,int end,int index)
    {
        if(qs>end || qe<start)
        {
            return 0;
        }
        if(start>=qs && end<=qe)
        {
            return st[index];
        }
        int mid=start+(end-start)/2;
        int left=query(qs,qe,start,mid,2*index+1);
        int right=query(qs,qe,mid+1,end,2*index+2);
        return Math.max(left,right);
    }
    public static void update(int start,int end,int index,int val,int u)
    {
        if(start==end)
        {
            st[u]=val;
            return;
        }
        if(start>index || end<index)
        {
            return;
        }
        int mid=start+(end-start)/2;
        update(start,mid,index,val,2*u+1);
        update(mid+1,end,index,val,2*u+2);
        st[u]=Math.max(st[2*u+1],st[2*u+2]);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=4;
	    arr=new int[]{1,2,5,4};
	    build(0,0,n-1);
        System.out.println(query(0,2,0,n-1,0));
        arr[0]=2;
	    update(0,n-1,0,7,0);
	    System.out.println(query(0,2,0,n-1,0));
	    
	}
}
