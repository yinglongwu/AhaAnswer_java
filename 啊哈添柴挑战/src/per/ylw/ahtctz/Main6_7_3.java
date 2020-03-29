package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1674. 学科统计
public class Main6_7_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum1=0,sum2=0,sum3=0;
		int[][] arr = new int[n][3];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			sum1 = sum1+arr[i][0];
			sum2 = sum2+arr[i][1];
			sum3 = sum3+arr[i][2];
		}
		
		System.out.print(sum1/n+" "+sum2/n+" "+sum3/n);
		
	}

}
