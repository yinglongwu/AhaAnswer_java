package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1441. Å¼ÊýºÍ
public class Main4_4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum=0;
		
		for (int i = 1; i <= N; i++) {
			if (i%2==0) {
				sum = sum+i;
			}
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
