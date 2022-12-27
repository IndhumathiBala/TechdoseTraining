import  java.util.*;
public class Main
{
    static int arr[],segTree[];
    static void buildTree(int index,int low,int high)
    {
        if(low>high)
        {
            return ;
        }
        if(low==high)
        {
            segTree[index]=arr[low]==0?1:0;
            return;
        }
        int mid=low+(high-low)/2;
        buildTree(2*index+1,low,mid);
        buildTree(2*index+2,mid+1,high);
        segTree[index]=segTree[2*index+1]+segTree[2*index+2];
    }
    static void update(int index,int u_i,int low,int high,int val)
    {
        if(u_i<low || u_i>high)
        {
            return;
        }
        else if(low==high)
        {
            segTree[index]=val==0?1:0;
            return;
        }
        int mid=low+(high-low)/2;
        update(2*index+1,u_i,low,mid,val);
        update(2*index+2,u_i,mid+1,high,val);
        segTree[index]=segTree[2*index+1]+segTree[2*index+2];
        
    }
    static int query(int index,int low,int high,int k)
    {
        if(segTree[index]<k)
        {
            return -1;
            
        }
        else if(low==high)
        {
            return low;
        }
        int mid=low+(high-low)/2;
        if(segTree[2*index+1]>=k)
        return query(2*index+1,low,mid,k);
        else
        return query(2*index+2,mid+1,high,k-segTree[2*index+1]);
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
		arr=new int[]{1,0,0,1,0,0};
		segTree=new int[4*n+1];
		buildTree(0,0,5);
		System.out.println(query(0,2,5,2));
		arr[5]=0;
		update(0,5,0,n-1,1);
		System.out.println(query(0,2,5,5));
		
	}
}
