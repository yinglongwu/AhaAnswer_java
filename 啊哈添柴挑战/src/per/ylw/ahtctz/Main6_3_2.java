package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1632. 十进制转二进制
public class Main6_3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(tenToTwo(n));
		scanner.close();
	}
	
	//十进制转二进制，除以2，倒取余
	public static String tenToTwo(int x) {
		String s = "";
		if (x==0) {
			s = "0";
		} else {
			while (x!=0) {
				s = s + Integer.toString(x%2);
				x=x/2;
			}
		}
		String result = new StringBuffer(s).reverse().toString();
		return result;
	}

}
