//red team
import java.util.*;


public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
    
        if(N%2==0) {
            if(N>=6&&N<=20) {
                System.out.println("Weird");
            }
            else if(N>20) {
                System.out.println("Not Weird");
            }
            else if(N<=5&&N>=2){
                 System.out.println("Not Weird");
            }
        }
        else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}
