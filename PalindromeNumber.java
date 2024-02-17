import java.util.*;
public class PalindromeNumber{
    
    public static void main(String[] args) {
        
        System.out.println("Provide a number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int temp=no;
        
        int rev=0;
        int rem;
        
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println("Reverse of the number is "+rev);
        if(no==rev){
            System.out.println("The NUMBER IS PELINDROME");

        }else{
            System.out.println("The number is not pelindrome");
        }
    }
}