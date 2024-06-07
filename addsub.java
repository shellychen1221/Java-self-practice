import java.util.Scanner;
public class addsub {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("input first number");
        a = sc.nextInt();
        System.out.println("input second number");
        b = sc.nextInt();
        sc.close();
        System.out.println("The add value is"+add(a,b));
        System.out.println("The sub value is"+sub(a,b));
    }

    public static int add(int a,int b)
    {
       return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
}