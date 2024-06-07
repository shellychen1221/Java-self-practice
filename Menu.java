import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the choice, 1 is C to F, 2 is F to C, 3 is K to C: ");
        int i=sc.nextInt();
        double ans=0;
        switch (i){
            case 1:
                System.out.println("You choose 1, C to F");
                System.out.println("Enter the Centigrade temperature: ");
                double c=sc.nextDouble();
                ans= (((c*9)/5)+32);
                System.out.println("F= "+ans);
                break;
            case 2:
                System.out.println("You choose 2, F to C");
                System.out.println("Enter the Fahrenheit temperature: ");
                double f=sc.nextDouble();
                ans= ((f-32)*5/9);
                System.out.println("C= "+ans);
                break;
            case 3:
                System.out.println("You choose 3, K to C");
                System.out.println("Enter the Kelvin temperature: ");
                double k=sc.nextDouble();
                ans= (k-273.15);
                System.out.println("C= "+ans);
                break;
            default:
                break;
        }
        sc.close();

    }
}
