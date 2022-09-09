import java.util.Scanner;
public class Main
{
    static int findGcd(int a,int b)
    {
        return b==0?a:findGcd(b,a%b);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int gcd=findGcd(a,b);
	    System.out.println(gcd);
	}
}
