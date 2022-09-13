package ArrayHomework;

public class BubbleSortEx {

	static int[] bubbleSort(int arr[]) {

		int i,j;
		for ( i = 0; i < arr.length; ++i) {
			for ( j = 0; j < arr.length -1; ++j)
			{
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	static void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int arr[] = { 1, 2, 4, 2, 8 };

		System.out.println("Before Sorting");
		printArray(arr);
		arr= bubbleSort(arr);
		System.out.println("After Sorting");
		printArray(arr);

	}

}
