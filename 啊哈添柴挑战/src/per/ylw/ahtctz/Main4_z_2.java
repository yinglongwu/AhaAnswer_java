package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1032. Çø¼äºÍ
public class Main4_z_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m= scanner.nextInt();
		int n= scanner.nextInt();
		int sum = 0;
		
		for (int i = m; i <= n; i++) {
				sum = sum + i;
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
