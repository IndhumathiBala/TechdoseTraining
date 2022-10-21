import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int []nums=new int [n];
	    int prevGreaterEle[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        nums[i]=sc.nextInt();
	    }
	    Stack<Integer>stack=new Stack<>();
	    for(int i=n-1;i>=0;i--)
	    {
	        while(!stack.isEmpty() && nums[stack.peek()]<nums[i])
	        {
	            prevGreaterEle[stack.pop()]=nums[i];
	        }
	        stack.push(i);
	    }
	    while(!stack.isEmpty())
	    {
	        prevGreaterEle[stack.pop()]=-1;
	    }
	    for(int i=0;i<n;i++)
	    {
	        System.out.print(prevGreaterEle[i]+" ");
	    }
	    
	}
}
