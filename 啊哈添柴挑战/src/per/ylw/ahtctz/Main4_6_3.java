package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1462. 数字三角形（进阶版）
public class Main4_6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
