import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
//		// checked
//		/**
//		 * ParseException khi mà chuyển từ String -> Date
//		 * IOException = Input Output Exception
//		 * */
//		int[] arr = new int[10];
//		if(arr.length == 0) {
//			throw new Exception("array is empty");
//		}
		
		String[] arr = {"a","4","b"};
		
		
		
//
//		// uncheked
//		/**
//		 * NullPointerException
//		 * NumberFotmatException -> chuển đổi chữ thành số
//		 * */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số a: ");
		int a = inputNumber(scanner);
		System.out.println("Nhập vào số b: ");
		int b = inputNumber(scanner);
		System.out.println("Tổng a + b = " + (a + b));
//		try {
//			Date now = inputDate(scanner);
//		} catch (ParseException e) {
//			System.err.println("Vui lòng nhập lại dd/MM/yyyy: ");
//		}
		
		
//		String str = "nguyen6duc9hai";
//		List<String> list = new ArrayList<>();
//		for (int i = 0; i < str.length(); i++) {
//			try {
//				Integer.parseInt(String.valueOf(str.charAt(i)));
//			} catch (NumberFormatException e) {
//				list.add(String.valueOf(str.charAt(i)));
//			}
//		}
//		System.out.println(list);
	}
	
	public static int inputNumber(Scanner sc) {
		do {
			try {
				return Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.err.println("Vui lòng nhập lại: ");
			}
		} while (true);
	}
	
	public static Date inputDate(Scanner sc) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(sc.nextLine());
	}
	
}
