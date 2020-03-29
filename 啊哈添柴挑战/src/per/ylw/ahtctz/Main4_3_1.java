package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1432. ¾ÍÊÇÏ²»¶7
public class Main4_3_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i%7==0||i%10==7) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
