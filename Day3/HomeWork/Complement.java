
import java.util.*;
public class Main
{
    public static int flip_bit(int n)
    {
        for(int i=0;(n>>i)!=0;i++)
        {
            n^=(1<<i);
        }
        return n;
    }
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           int n=sc.nextInt();
        //   1's complement--Toggle all the bit Not only MSB Length (1sCompliment)
           System.out.println(~n);
        //   2's complement
           System.out.println((~n)+1);
        //   Manual toggle--Toggle only until MSB
            System.out.println(flip_bit(n));
        // Manual 2's complement
            System.out.println(flip_bit(n)+1);
	}
}
