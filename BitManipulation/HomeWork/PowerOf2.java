import java.util.*;
public class Main
{
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
           System.out.println((n&(n-1))==0?"Power of 2":"Not a power of 2");
	}
}
