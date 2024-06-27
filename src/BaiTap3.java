import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số lượng phần tử: ");
		int n = Integer.parseInt(scanner.nextLine());
		String[] arr = new String[n];
		// nhập vào từng phần tử
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextLine();
		}
		
		// tính tổng nếu là số nguyên
		int sum = 0;
			for (int i = 0; i < arr.length; i++) {
			try {
				sum += Integer.parseInt(arr[i]);
			} catch (NumberFormatException e) {
				System.err.println(arr[i] + " Không phải số nguyên");
			}
		}
		System.out.println("sum = " + sum);
	}
}
