import java.util.Scanner;

public class BaiTap9 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào vị trí số fibanacci: ");
		int location = Integer.parseInt(sc.nextLine());
		
		if (location < 0) {
			throw new Exception("vị trí phải là số nguyên dương");
		}
		
		
		int firstNumber = 0;
		int secondNumber = 1;
		if (location == 1 || location == 2) {
			System.out.println(location - 1);
			return;
		}
		// 0,1,1,2,3,5,8,13,21,...
		int count = 2;
		while (count <= location) {
			int tempNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = tempNumber;
			count++;
			if (count == location) {
				System.out.println(tempNumber);
				break;
			}
		}
		
	}
}
