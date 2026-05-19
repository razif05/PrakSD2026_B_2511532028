package pekan7_2511532028;

public class SelectionSort_2511532028 {
	public static void selectionSort_2511532028(int[] arr) {
		int n_2028 = arr.length;
		for (int i = 0; i < n_2028; i++) {
			int minIndex_2028 = i;
			for (int j = i + 1; j < n_2028; j++) {
				if (arr[j] < arr[minIndex_2028]) {
					minIndex_2028 = j;
				}
			}
			int temp_2028 = arr[i];
			arr[i] = arr[minIndex_2028];
			arr[minIndex_2028] =  temp_2028;
		}
	}
	
	public static void main(String[] args) {
		int arr_2028[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2028 = arr_2028.length;
		System.out.printf("array yang belum terurut :\n ");
		for (int i = 0; i < n_2028; i++)
			System.out.print(arr_2028[i] + " ");
		System.out.println("");
		selectionSort_2511532028(arr_2028);
		System.out.printf("array yang terurut :\n");
		for (int i = 0; i < n_2028; i++) 
			System.out.print(arr_2028[i] + " ");
		System.out.println("");

	}

}
