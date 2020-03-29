package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1026. 简单计算器
public class Main7_1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		calculator(s);
		scanner.close();
	}
	
	public static void calculator(String s) {
		char c = 0;
		//使用正则表示式筛选出计算符号
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).matches("[^0-9]")) {
				c = s.charAt(i);
			}
		}
		//使用正则表达式分割字符串
		String[] sArr = s.split("[^0-9]");
		int a = Integer.parseInt(sArr[0]);
		int b = Integer.parseInt(sArr[1]);
		switch (c) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;	
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			try {//抓除数为0的异常
				System.out.println(a/b);
			} catch (ArithmeticException  e) {
				System.out.println("Divided by zero!");
			}
			break;
		default:
			System.out.println("Invalid operator!");
			break;
		}
	}

}
