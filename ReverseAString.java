import java.util.*;
public class ReverseAString {
 public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Pass a String");
    String name=s.next();
    String rev="";
    for(int i=name.length()-1;i>=0;i--){
          rev=rev+name.charAt(i);
    }
    System.out.println("Reverse of "+name+"is "+rev);
 }   
}
