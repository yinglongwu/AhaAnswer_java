package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1027. Èý½ÇÐÎÅÐ¶Ï
public class Main3_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a+b>c&&a+c>b&&b+c>a) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		scanner.close();
	}

}
