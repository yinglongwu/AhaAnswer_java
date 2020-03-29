package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1024. 判断一个数能否同时被3和5整除
public class Main3_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (n%3==0&&n%5==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		scanner.close();
	}

}
