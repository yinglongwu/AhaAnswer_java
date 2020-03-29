package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1323. øº ‘≥…º®
public class Main3_2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a<60) {
			System.out.println("no");
		} else {
			System.out.println("yes");
		}
		
		scanner.close();
	}

}
