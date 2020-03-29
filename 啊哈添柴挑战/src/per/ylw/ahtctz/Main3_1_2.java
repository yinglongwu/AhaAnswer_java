package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1312. 比较算符的本质
public class Main3_1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a>b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		scanner.close();
	}

}
