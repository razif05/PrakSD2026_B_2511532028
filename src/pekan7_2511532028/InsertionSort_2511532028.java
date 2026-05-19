package pekan7_2511532028;

public class InsertionSort_2511532028 {
	
	public static void insertionSort_2511532028 (int[] arr) {
		int n_2028 = arr.length;
		for (int i = 1; i < n_2028; i++) {
			int key_2028 = arr[i];
			int j_2028 = i - 1;
			while (j_2028 >= 0 && arr[j_2028] > key_2028) {
				arr[j_2028+1] = arr[j_2028];
				j_2028--;
			}
			arr[j_2028+1] = key_2028;
		}
	}
	

	public static void main(String[] args) {
		int arr_2028[] = {23, 78, 45, 8, 32, 56, 1};
		int n_2028 = arr_2028.length;
		System.out.printf("array yang belum terurut : ");
		for (int i = 0; i < n_2028; i++) 
			System.out.print(arr_2028[i] + " ");
		System.out.println("");
		insertionSort_2511532028(arr_2028);
		System.out.printf("array yang terurut :\n");
		for (int  i = 0; i < n_2028; i++) 
			System.out.print(arr_2028[i] + " ");
		System.out.println("");
	}

}
