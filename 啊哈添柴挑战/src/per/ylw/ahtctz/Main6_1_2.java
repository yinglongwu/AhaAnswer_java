package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1044. ���ַ�ת���򵥰�
public class Main6_1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//intתStringȻ�����String����new StringBuffer
		StringBuffer sBuffer = new StringBuffer(Integer.toString(n));
		System.out.println(sBuffer.reverse());//reverse����ʵ��StringBuffer��ת
		scanner.close();
	}

}
