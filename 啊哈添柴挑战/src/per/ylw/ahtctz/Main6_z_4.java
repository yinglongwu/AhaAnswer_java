package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1693. ºÃÉùÒô
public class Main6_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum1=0,sum2=0;
		int[][] arr = new int[2][10];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}

		Arrays.sort(arr[0]);
		Arrays.sort(arr[1]);

		for (int j = 1; j < 9; j++) {
			sum1 = sum1+arr[0][j];
			sum2 = sum2+arr[1][j];				
		}

		System.out.print(sum1/8+" "+sum2/8);
	}

}
