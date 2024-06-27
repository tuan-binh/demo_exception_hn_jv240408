import java.util.Arrays;

public class BaiTap5 {
	public static void main(String[] args) {
		int[] arr = {5, 1, 2, 8, 2, 8, 10};
		// sắp xếp trước
		Arrays.sort(arr);
		// sau đó mới tìm kiếm
		System.out.println(Arrays.toString(arr));
		try {
			int indexSearch = binarySearch(arr, 8);
			System.out.println(indexSearch);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static int binarySearch(int[] arr, int search) throws Exception {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		throw new Exception("not found");
	}
	
}
