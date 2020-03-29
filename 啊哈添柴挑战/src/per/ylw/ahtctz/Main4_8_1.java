package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1498. Ó²±Ò¶Ò»»
public class Main4_8_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int count = 0;
		
		for (int i = 0; i <= a/5; i++) {
			for (int j = 0; j <= a/2; j++) {
				for (int k = 0; k <= a; k++) {
					if (k+2*j+5*i==a) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);
		scanner.close();
	}

}
