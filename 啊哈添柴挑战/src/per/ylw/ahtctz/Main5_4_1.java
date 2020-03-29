package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1047. 有几位数呢
public class Main5_4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String s = Integer.toString(n);
		System.out.println(s.length());
		scanner.close();
	}

}
