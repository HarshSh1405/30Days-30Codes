import java.util.*;
public class printtable {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("\"Enter the number to print table\"");
    int n=s.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(n+"*"+i+"="+n*i);
    }
    
    


    
}
}