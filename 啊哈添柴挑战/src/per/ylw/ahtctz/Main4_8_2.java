package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1482. ºï×Ó³ÔÌÒ
public class Main4_8_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		
		for (int i = 1; i <= k; i++) {
			n=n/2-1;
		}
		
		if (n<0) {
			System.out.println(0);
		}else {
			System.out.println(n);
		}
		
		scanner.close();
	}

}
