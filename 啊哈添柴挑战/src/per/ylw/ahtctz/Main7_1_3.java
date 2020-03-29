package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1026. �򵥼�����
public class Main7_1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		calculator(s);
		scanner.close();
	}
	
	public static void calculator(String s) {
		char c = 0;
		//ʹ�������ʾʽɸѡ���������
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1).matches("[^0-9]")) {
				c = s.charAt(i);
			}
		}
		//ʹ��������ʽ�ָ��ַ���
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
			try {//ץ����Ϊ0���쳣
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
