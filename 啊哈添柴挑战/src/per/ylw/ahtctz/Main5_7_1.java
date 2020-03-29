package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1048. 所有位上的和
public class Main5_7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		String s = Integer.toString(n);
		
		for (int i = 0; i < s.length(); i++) {
			sum = sum + Integer.parseInt(s.substring(i, i+1));
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
