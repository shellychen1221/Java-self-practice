//red team
import java.util.*;

public class JavaString {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String A=scanner.next();
        String B=scanner.next();
        /* Enter your code here. Print output to STDOUT. */
        //sum the lengths of A and B.
        System.out.println(A.length()+B.length());
        int i = A.compareTo(B);
        if(i>0){
             //if A is lexicographically greater than B otherwise print No instead
             System.out.println("Yes");
        } else{
             System.out.println("No");
        }
        String a = A.substring(0,1).toUpperCase()+A.substring(1);
        String b = B.substring(0,1).toUpperCase()+B.substring(1);
        //capitalize the first letter in both A and B and print them on a single line, separated by a space.
        scanner.close();
        System.out.println(a+" "+b);
    }
}