package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1079. 3�ı���
public class Main3_3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		
		//����һ������ת��
//		String s = Integer.toString(x);	//intתString
		//��String��ȡ�����䣨a��b��������b�ж�Ӧ���ַ�
//		String s0 = s.substring(0, 1);
//		String s1 = s.substring(1, 2);
//		String s2 = s.substring(2, 3);
		//Stringתint�����
//		int sum = Integer.parseInt(s0)+Integer.parseInt(s1)+Integer.parseInt(s2);
		
		//����������ѧ����
		int a = x/100;
		int b = (x-a*100)/10;
		int c = x%10;
		int sum = a+b+c;
		
		//�ж�
		if (sum%3==0) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
		scanner.close();
	}

}
