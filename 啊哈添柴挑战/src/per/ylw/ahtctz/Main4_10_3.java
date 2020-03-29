package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1493. ¾Å¾Å³Ë·¨±í£¿
public class Main4_10_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d*%d=%d ",i,j,i*j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
