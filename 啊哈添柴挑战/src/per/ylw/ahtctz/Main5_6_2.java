package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1053. ��֤��°ͺղ��루�򵥰棩
public class Main5_6_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		
		for (int i = 2; i <= n/2; i++) {
			if (isPrime(i)&&isPrime(n-i)) {
				count++;
			}
		}
		
		System.out.println(count);
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
