package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1673. 数组的最大值
public class Main6_7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int max = arr[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j]>max) {
					max = arr[i][j];
					a = i; b= j;
				}
			}
		}
		System.out.println(max+" "+a+" "+b);
	}

}
