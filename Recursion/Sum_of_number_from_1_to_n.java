import java.util.*;
class Sum_of_number_from_1_to_n
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(findSum(n));
 }
 static int findSum(int n)
 {
    if(n==1)
    return 1;
    return n+findSum(n-1);
 }
}