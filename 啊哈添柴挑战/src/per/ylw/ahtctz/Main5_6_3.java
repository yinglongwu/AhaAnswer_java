package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1563. ��°ͺղ���
public class Main5_6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 2; i <= n/2; i++) {
			if (isPrime(i)&&isPrime(n-i)) {
				System.out.println(i+"+"+(n-i));
			}
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

