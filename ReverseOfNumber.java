import java.util.*;
public class ReverseOfNumber{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number : ");
    int rem, rev=0;
    int no=s.nextInt();
    while(no!=0){
        rem=no%10;
        rev=rev*10+rem;
        no=no/10;


    }
    System.out.println(rev);
}
}