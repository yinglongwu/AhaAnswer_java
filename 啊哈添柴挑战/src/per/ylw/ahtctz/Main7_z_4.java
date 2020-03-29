package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1076. º€∏Ò≤È—Ø£®2£©
public class Main7_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		int[] arr = new int[count];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			switch (arr[i]) {
			case 1:
				System.out.println("apples");
				System.out.println(3.00);
				break;
			case 2:
				System.out.println("pears");
				System.out.println(2.50);
				break;
			case 3:
				System.out.println("oranges");
				System.out.println(4.10);
				break;
			case 4:
				System.out.println("grapes");
				System.out.println(10.20);
				break;
			default:
				System.out.println("error");
				System.out.println(0.0);
				break;
			}
		}
	}
}
