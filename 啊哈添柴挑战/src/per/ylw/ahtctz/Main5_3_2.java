package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1054. �����ж�
public class Main5_3_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if (isPrime(n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
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
