import java.util.*;
public class PrimeNumber {

public static void main(String args[]) {
     
      Scanner s=new Scanner(System.in);
      System.out.println("Pass a number");
      int temp=0;
      int no= s.nextInt();
      for(int i=2; i<=no-1;i++){
        if(no%i==0){
        temp=temp+1;
        }
      }
if(temp==0){
    System.out.println(no+" is prime ");
}
else{
    System.out.println(no+" is not prime ");
}
    
}
    
}
