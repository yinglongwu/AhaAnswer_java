package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1633. 二进制转十进制
public class Main6_3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		System.out.println(Integer.parseInt(n,2));
		scanner.close();
	}

}
