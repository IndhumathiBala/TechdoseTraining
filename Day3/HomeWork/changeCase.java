import java.util.*;
public class Main
{
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           char ch=sc.next().charAt(0);
        //   IN LOWERCASE--set 6th bit if it is not set(|)
           System.out.println((char)(ch|(1<<5)));
        //   IN UPPERCASE--unset 6th bit if it is set(&)
           System.out.println((char)(ch&(~(1<<5))));
        //   FLIPCASE--TOGGLE 6 th bit
           System.out.println((char)(ch^(1<<5)));
	}
}
