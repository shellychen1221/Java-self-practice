import java.util.*;
public class UpperLower {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        char a[]=new char[100];
        char b[]=new char[100];
        String s2=s.toUpperCase();
        String s3=s.toLowerCase();

        for(int i=0;i<=s.length()-1;i++){
            a[i] = s2.charAt(i);
            b[i] = s3.charAt(i);
        }
        System.out.print(a[0]);
        for(int j=1;j<=s.length()-1;j++){
            System.out.print(b[j]);
        }
        sc.close();

    }
}
