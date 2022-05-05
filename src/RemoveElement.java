
public class RemoveElement {
	public static int removeElement(int[] nums, int val) {
		if (nums.length == 1 && nums[0] != val) {
			return 1;
		}
		int count = 0;
		int ar[] = nums;
		int i = 0;
		while (i < ar.length) {
			if (ar[i] == val) {
				i++;
			} else {
				nums[count] = ar[i];
				count++;
				i++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
//		int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
//		int arr[] = { 2 };
//		int val = 3;
//		int arr[] = { 4, 5 };
//		int val = 4;

//		int arr[] = { 3, 3 };
//		int val = 3;
//		int arr[] = { 1 };
//		int val = 1;
		int arr[] = { 3, 2, 2, 3 };
		int val = 3;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int c = removeElement(arr, val);
		System.out.println();
		for (int i = 0; i < c; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
