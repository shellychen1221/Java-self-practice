import java.util.Scanner;
public class integerorfloat
{
    public static void main(String[] args)
    {
        boolean shelly;
        float i , j;
        float num=0;
        float num2=0;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a number1 as input:");
                num = sc.nextFloat();
                System.out.println("Enter a number2 as input:");
                num2 = sc.nextFloat();
                sc.close();
                shelly=false;
            }
            catch(Exception p)
            {
                System.out.println("Enter only integer decimal value.."+ p);
                shelly=true;
            }
        }
        while(shelly);
        i=num;j=num2;

        System.out.println("The  value is "+add(i,j));
        System.out.println("The  value is "+sub(i,j));
        System.out.println("The  value is "+mul(i,j));
        System.out.println("The  value is "+div(i,j));
    }
    public static float add(float i,float j)
    {
        return i+j;
    }
    public static float sub(float i,float j)
    {
        return i-j;
    }
    public static float mul(float i,float j)
    {
        return i*j;
    }
    public static float div(float i,float j)
    {
        return i/j;
    }
}
