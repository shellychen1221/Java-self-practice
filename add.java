import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the first number:");
        n1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        n2 = scanner.nextInt();
        System.out.println(n1+n2);
        scanner.close();
    }
}