package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1045. ��10001��������ʲô
public class Main5_6_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int i = 2;//������2��ʼ
		
		while (true) {
			if (isPrime(i)) {	//���������
				count++;	//������+1
			}
			if (count == n) {	//���������==Ҫ��ĵ�n������
				System.out.println(i);
				break;
			}
			i++;
		}
		
		scanner.close();
	}

	public static boolean isPrime (int x) {
		if (x==2) {
			return true;
		} else {
			for (int i = 2; i < x; i++) {
				if (x%i==0) {//һ�����������ģ�ֱ�ӷ���false
					return false;
				}
			}
			return true;
		}
	}
}
