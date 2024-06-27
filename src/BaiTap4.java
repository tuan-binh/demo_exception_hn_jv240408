import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào chuỗi");
		String line = sc.nextLine();
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < line.length(); i++) {
			try {
				list.add(Integer.parseInt(String.valueOf(line.charAt(i))));
			} catch (NumberFormatException e) {
				list.add(0);
			}
		}
		System.out.println(list);
	}
}
