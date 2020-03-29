package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1038. 数1的个数
public class Main5_z_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = "";
		int count = 0;
		for (int i = 1; i <= n; i++) {
			s = s + Integer.toString(i);
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).equals("1")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
