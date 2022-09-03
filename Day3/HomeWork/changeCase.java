import java.util.*;
public class Main
{
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           char ch=sc.next().charAt(0);
        //   IN LOWERCASE
           System.out.println((char)(ch|(1<<5)));
        //   IN UPPERCASE
           System.out.println((char)(ch&(~(1<<5))));
        //   FLIPCASE
           System.out.println((char)(ch^(1<<5)));
	}
}
