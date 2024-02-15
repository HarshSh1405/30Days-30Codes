import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String mn;
       do{
        System.out.println("Enter first number");
        int no1=sc.nextInt();
        System.out.println("Enter the second number");
        int no2=sc.nextInt();
        
        System.out.println("Please select the operation bitch from + , - , * , /");
        String str=sc.next();
        double r;
        switch(str){
            case"+": r=no1+no2;
            System.out.println("Addition is" + r);
            break;
            case"-": if(no1>no2){
                r=no1-no2;
                System.out.println("Subtraction is  " +  r);
            }else{
                r=no2-no1;
                System.out.println("Subtraction is -" +  r);
            }
            break;
            case"*": r=no1*no2;
            System.out.println("Multiplication is  " +  r);
            break;
            case"/": r=(double)no1/no2;
            System.out.println("division is  " +  r);
            break;
            default:System.out.println("Enter valid characters"); }
            System.out.println("press y to continue or n to exit");
            mn=sc.next();

       
    }while(mn.equals("y")|| mn.equals("Y"));
        
        
    }
    
}
