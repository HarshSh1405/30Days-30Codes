import java.util.*;
public class FibonacciSeriesUsingRecursion{
    static int a=0,b=1,c;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number upto which you want the fibonacci series");
        int no=sc.nextInt();
        System.out.print(a+" "+b);
        FibonacciSeriesUsingRecursion ob=new FibonacciSeriesUsingRecursion();
        ob.printfib(no);


    }
    void printfib(int no){
        if(no>=1){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printfib(no-1);
        }
    }
}
