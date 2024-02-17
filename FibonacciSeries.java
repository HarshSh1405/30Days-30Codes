import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the input upto which you want the fibonacci series");
        int no=sc.nextInt();
        int a=0, b=1,c;
        System.out.print(a+" "+b);
        for(int i=1;i<=no;i++){
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;

        }
    }
    
}
