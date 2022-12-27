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
    static int query(int index,int qs,int qe,int low,int high)
    {
        if(qe<low || qs>high)
        {
            return 0;
            
        }
        else if(low==high)
        {
            return segTree[index];
        }
        int mid=low+(high-low)/2;
        int left=query(2*index+1,qs,qe,low,mid);
        int right=query(2*index+2,qs,qe,mid+1,high);
        return left+right;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=6;
		arr=new int[]{1,0,0,1,0,0};
		segTree=new int[4*n];
		buildTree(0,0,5);
		System.out.println(query(0,2,5,0,n-1));
		arr[5]=0;
		update(0,5,0,n-1,1);
		System.out.println(query(0,2,5,0,n-1));
		
	}
}
