
import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		bubbleSort(new int[] {2,16,85,14,31,67});
		bubbleSort(new int[] {-1,0,1});
		bubbleSort(new int[] {-7,-10,-12,-15});
	}
	
	public static void bubbleSort(int[] numbers) {
		System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));
		for(int i=0; i<numbers.length;i++) {
			for(int j=numbers.length-1;j>i;j--) {
				if(numbers[j]<numbers[j-1]) {
					Swap(numbers,j,j-1);
				}
			}
		}
		System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",Arrays.toString(numbers));
	}
	public static void Swap(int[] array, int from, int to) {
		int temp=array[from];
		array[from]=array[to];
		array[to]=temp;
	}
}


