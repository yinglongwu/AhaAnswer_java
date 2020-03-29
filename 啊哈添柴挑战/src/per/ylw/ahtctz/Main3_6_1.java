package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1028. ≈–∂œ»ÚƒÍ
public class Main3_6_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if ( (a%4==0&&a%100!=0)||a%400==0 ) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		scanner.close();
	}

}
