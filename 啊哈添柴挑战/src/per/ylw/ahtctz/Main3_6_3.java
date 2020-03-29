package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1361. 三个数找最小
public class Main3_6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
	
		System.out.println((a<b?a:b)<c?(a<b?a:b):c);
		
		scanner.close();
	}

}
