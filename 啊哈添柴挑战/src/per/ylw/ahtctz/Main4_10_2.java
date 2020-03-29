package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1492. for循环菱形
public class Main4_10_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		//上半部分
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//下半部分
		for (int i = n-1; i >= 1; i--) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for (int j = 2*i-1; j >= 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
