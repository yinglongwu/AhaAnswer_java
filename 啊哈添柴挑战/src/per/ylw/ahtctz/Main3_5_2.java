package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1351. ÅÐ¶ÏÔ¼Êý
public class Main3_5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a%b==0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		scanner.close();
	}

}
