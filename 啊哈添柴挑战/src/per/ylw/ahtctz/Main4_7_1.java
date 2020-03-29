package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1471. Ñ­»·Ç¶Ì×-½ø½×
public class Main4_7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n+1; j++) {
				if (j<=i) {
					System.out.print("*");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		scanner.close();
	}

}