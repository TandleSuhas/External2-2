import java.util.*;
public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int FirstTerm=0;
        int SecondTerm=1;
      System.out.println("Fibonacci Series till"+n+"terms : ");
     for(int i=1;i<=n;++i)
    {
        System.out.print(FirstTerm+" , ");
        int NextTerm=FirstTerm+SecondTerm;
        FirstTerm=SecondTerm;
        SecondTerm=NextTerm; 
       }  
    }
}