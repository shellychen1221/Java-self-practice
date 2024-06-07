import java.util.*;
public class fib{
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term: ");
		int num=sc.nextInt();
		int n=0;
		for(int i=1;i<=num;i++) {
			fib(i);
		}
	}
	public static int fib(int n) {
		int fn = 0;
		int fn2;
		int fn1;
		if(n<=1) {
			System.out.println(n); 
			return n;
		}
		else {
			fn2=0;
			fn1=1;
			for(int i=2;i<=n;i++) {
				fn=fn2+fn1;
				fn2=fn1;
				fn1=fn;
			}
			System.out.println(fn1);
			return fn1;
		}
	}
}