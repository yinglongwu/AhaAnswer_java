package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1433. µ¯ÌøµÄÆ¤Çò
public class Main4_3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int sum = 0;
		
		for (int i = n; i > 0; i=i/2) {
			count++;
			sum = sum + i*2;
		}
		
		System.out.print(count+" "+(sum-n));
		scanner.close();
	}

}
