import java.util.Scanner;

public class Prog {
    public static void main(String[] args) {
        //Prog1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
        //Prog2
        int n1,n2;
        System.out.println("Enter the first number:");
        n1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        n2 = scanner.nextInt();
        System.out.println(n1+n2);
        //Prog3
        float C,F;
        System.out.println("Enter the Celsius temperature:");
        C = scanner.nextFloat();
        F = (C*9/5)+32;
        System.out.println("The Fahrenheit temperature is "+F);
        //Prog4
        int P,T;
        float R,I;
        System.out.println("Enter the principe:");
        P = scanner.nextInt();
        System.out.println("Enter the rate:");
        R = scanner.nextFloat();
        System.out.println("Enter the time:");
        T = scanner.nextInt();
        I=P*R*T/100;
        System.out.println("The simple interest is"+I);
        //Prog5
        int S,H,M,S2;
        System.out.println("Enter second:");
        S = scanner.nextInt();
        H = S/3600;
        M = S%3600/60;
        S2 = S-H*3600-M*60;
        System.out.println("Hours:"+H);
        System.out.println("Minutes:"+M);
        System.out.println("Seconds:"+S2);
        //Prog6
        float fn,sn;
        System.out.println("Enter the first number:");
        fn = scanner.nextFloat();
        System.out.println("Enter the second number:");
        sn = scanner.nextFloat();
        float fn2,sn2;
        fn2=sn;
        sn2=fn;
        System.out.println("swap first number:"+fn2);
        System.out.println("swap second number:"+sn2);
        //Prog7
        float num1,num2;
        System.out.println("Enter the first number:");
        num1 = scanner.nextFloat();
        System.out.println("Enter the second number:");
        num2 = scanner.nextFloat();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("swap first number:"+num1);
        System.out.println("swap second number:"+num2);
        //Prog8
        int Radius;
        double A,Cir;
        System.out.println("Enter the radius:");
        Radius = scanner.nextInt();
        A = 3.14*Radius*Radius;
        Cir = 2*3.14*Radius;
        System.out.println("Area="+A);
        System.out.println("Circumference="+Cir);
        //Prog9
        int Length;
        int Width;
        double Area,Circumference;
        System.out.println("Enter the Length:");
        Length = scanner.nextInt();
        System.out.println("Enter the Width:");
        Width = scanner.nextInt();
        Area = Length*Width;
        Circumference = 2*(Length+Width);
        System.out.println("Area="+Area);
        System.out.println("Circumference="+Circumference);
        //Prog10
        int aa,bb,cc;
        double AA,ss;
        System.out.println("Enter a:");
        aa = scanner.nextInt();
        System.out.println("Enter b");
        bb = scanner.nextInt();
        System.out.println("Enter c");
        cc = scanner.nextInt();
        ss=(aa+bb+cc)/2;
        AA = Math.sqrt(ss*(ss-aa)*(ss-bb)*(ss-cc));
        System.out.println("Area="+AA);
        scanner.close();
    }
}
