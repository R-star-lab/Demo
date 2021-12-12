import java.util.Scanner;
import java.util.*;
public class prime{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n=sc.nextInt();
        int count=0,countprime=0;
        while(n>0){
            count=0;
            int i=1;
            while(i<=n){
                if(n%i==0){
                    count=count+1;
                }
            i=i+1;
            }
            if(count==2){
                countprime=countprime+1;
            }
            n=n-1;
        }
        System.out.println("number of primes"+countprime);
    }
}