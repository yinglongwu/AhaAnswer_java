package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1052. 回文数
public class Main5_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (isPalindromeNumber(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();
		
	}
	//判断是否为回文数
	public static boolean isPalindromeNumber(int x) {
		String s1 = Integer.toString(x);
		//把s1变为StringBuffer类，使用其reverse方法反转后，再转为String类型
		String s2 = new StringBuffer(s1).reverse().toString();
		if (s1.equals(s2)) {
			return true;
		}else {
			return false;
		}
		
	}

}
