package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1042. ������
public class Main6_z_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
	
	public static boolean isPrime (int x) {
		if (x==1) {	//1��������
			return false;
		}else if (x==2) {
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
