import java.util.*;
public class PrimeNumbersList {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Select the range from 1 to ");
        int temp=0;
        int no=s.nextInt();
        for(int i=2;i<=no;i++){
            
            for(int j=2;j<=i-1;j++){
                if(i%j==0){
                    temp=temp+1;
                }
                 }
                 if(temp==0){
                    System.out.println(i);
                }
                else{
                    temp=0;
                }
        }
    }
    
}
