package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1030. 有多少个约数
public class Main5_3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		
		for (int i = 1; i <= n ; i++) {
			if (n%i==0) {
				count++;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}

}
