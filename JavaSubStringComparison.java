//red team
import java.util.Scanner;

public class JavaSubStringComparison{

    public static String getSmallestAndLargest(String s, int k) {
        String min = "";
        String max = "";
        min=s.substring(0,k);
        max=s.substring(0,k);
        for(int i=1;i<=s.length()-k;i++){
            String str=s.substring(i,i+k);
            if(min.compareTo(str)>0){
                min=str;
            }
            if(max.compareTo(str)<0){
                max=str;
            }
        }
        return min + "\n" + max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}