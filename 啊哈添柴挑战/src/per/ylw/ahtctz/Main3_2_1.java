package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1077. ÅÐ¶Ï¸ºÊý
public class Main3_2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		
		if (x<0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		scanner.close();
	}

}
