package ArrayHomework;

public class arrayhw11 {

	static int getSecondLargest(int arr[]) { // second largest number
		int temp = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = i + 1; j < arr.length; ++j) {
				// shorting

				if (arr[i] > arr[j]) // 2>5
				{
					// swapping
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr[arr.length - 2];
	}

	public static void main(String[] args) {
		// Write a Java program to find the second largest element in an array.
		int arr[] = { 2, 5, 50, 20, 10, 9 };
		System.out.println("Second largest Number: ");
		int secondLargest = getSecondLargest(arr);
		System.out.println(secondLargest);

	}

}
