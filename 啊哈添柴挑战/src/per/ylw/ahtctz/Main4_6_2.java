package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1461. Êý×ÖÈý½ÇÐÎ
public class Main4_6_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
