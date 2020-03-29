package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1037. ½±ÅÆ¼ÆÊý
public class Main5_5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[][] arr = new int[n][3];
		int sum=0,count1=0,count2=0,count3=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < n; i++) {
			count1 = count1 + arr[i][0];
			count2 = count2 + arr[i][1];
			count3 = count3 + arr[i][2];
			for (int j = 0; j < 3; j++) {
				sum = sum + arr[i][j];
			}
		}
		
		System.out.print(count1+" "+count2+" "+count3+" "+sum);
		scanner.close();
	}

}
