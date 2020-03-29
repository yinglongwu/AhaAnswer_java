package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1470. Ñ­»·Ç¶Ì×-¼òµ¥
public class Main4_7_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("M");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
