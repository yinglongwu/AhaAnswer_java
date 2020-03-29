package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1491. ±¼ÅÜµÄÐ¡ÈË
public class Main4_9_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		System.out.println(" O");
		System.out.println("-H-");
		System.out.println("I I");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println(" O");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("-H-");
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println("I I");
		}
		
		scanner.close();
	}

}
