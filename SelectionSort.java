
public class SelectionSort {
	public static int[] method1(int [] arry) {
		for(int i=0;i<arry.length-1;i++) {
			int count=i;
			for(int j=i+1;j<arry.length;j++) {
				if(arry[j]<arry[count]) {
					count=j;
				}
			}
			int smallerNumber=arry[count];
			arry[count]=arry[i];
			arry[i]=smallerNumber;
		}
		return arry;
	}
	public static void main(String a[]) {
		int []arry1= {23,54,65,98,57,80,62,76};
		System.out.println("array before sorting is ");
		for(int i=0;i<arry1.length;i++) {
			System.out.print(arry1[i]+" ");
		}
		int []arry2=method1(arry1);
		System.out.println("");
		System.out.println("Array after sorting is ");
		for(int i:arry2) {
			System.out.print(i);
			System.out.print(" ");
		}
	}
}

