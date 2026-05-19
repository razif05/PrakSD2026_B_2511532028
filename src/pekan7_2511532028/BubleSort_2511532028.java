package pekan7_2511532028;

public class BubleSort_2511532028 {
public static void bubbleSort_2511532028(int[] arr) {
	int n_2028 = arr.length;
	for (int i = 0; i < n_2028; i++) {
		for (int j = 0; j < n_2028-i-1; j++) {
			if ( arr[j] > arr[j+1]) {
				int temp_2028 = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp_2028;
				System.out.println("data : " + arr[j]+" "+arr[j+1]);
			}
		}
	}
}
	
	public static void main(String[] args) {
		int arr_2028[] = { 23, 78, 45, 8, 32, 56, 1 };
		int n_2028 = arr_2028.length;
		System.out.print("array yang belum terurut : ");
		for (int i = 0; i < n_2028; i++)
			System.out.print(arr_2028[i] + " ");
		System.out.println("");
		bubbleSort_2511532028(arr_2028);
		System.out.print("array yang terurut menggunakan BubleSort : ");
		for (int i = 0; i < n_2028; i++)
			System.out.print(arr_2028[i] + " ");
		System.out.println("");
		
	}

}
