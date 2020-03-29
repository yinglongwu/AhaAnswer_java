package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1097. 四则运算（进阶版）
public class Main2_7_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println((a+b)+" "+(a-b)+" "+a*b+" "+a/b);
		scanner.close();
	}

}
