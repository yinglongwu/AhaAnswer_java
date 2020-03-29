package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1331. Ä©Î»Îª0£¿
public class Main3_3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = Integer.toString(n);
		
		if (s.substring(s.length()-1).equals("0")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		scanner.close();
	}

}
