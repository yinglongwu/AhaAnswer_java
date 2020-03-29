package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1321. 正数、负数与0
public class Main3_2_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n>0) {
			System.out.println("yes");
		} else if (n<0) {
			System.out.println("no");
		} else {
			System.out.println(0);
		}
		
		scanner.close();
	}

}
