package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1087. ��һ����ĸ
public class Main2_8_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//java��û��nextchar()���������˼���ַ�����ĵ�һ��Ԫ��
		char ch = scanner.next().charAt(0);
		
		//ch+1�Ľ����ASCII�룬Ҫǿת��char
		System.out.println((char)(ch+1));
		scanner.close();
	}

}
