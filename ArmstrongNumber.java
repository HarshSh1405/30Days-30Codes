import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Provide a number");
        long no=sc.nextLong();
        // first find the length of the number
        int leng=0;
        long t1=no;
        while(t1!=0){
            
            leng=leng+1;
            t1=t1/10;
            
        }
        System.out.println("length is "+leng);
        // We will find different digits using reverse a number
        long t2=no;
        long rem,arm=0;
        while(t2!=0){
            long mul=1;
            rem=t2%10;
            for(int i=1;i<=leng;i++){
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;
        }
        if(no==arm){
            System.out.println("Number is armstrong");
        }else{
            System.out.println("Number is not armstrong");
        }
        
    }
    
}
