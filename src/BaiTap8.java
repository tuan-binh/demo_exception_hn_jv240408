import java.util.Scanner;

public class BaiTap8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập và số cần kiểm tra");
		int number = Integer.parseInt(scanner.nextLine());
		try {
			isPrime(number);
			System.out.println(number + " Là số nguyên tố");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	public static void isPrime(int number) throws Exception {
		if (number < 2) {
			throw new Exception(number + " không phải số nguyên tố");
		}
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (!isPrime) {
			throw new Exception(number + " không phải số nguyên tố");
		}
	}
	
}
