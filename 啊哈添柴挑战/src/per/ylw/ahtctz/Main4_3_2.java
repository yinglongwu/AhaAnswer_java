package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1431. 大家来数7
public class Main4_3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (i%7==0||i%10==7) {
				System.out.print(i+" ");
			}
		}
		scanner.close();
	}

}
