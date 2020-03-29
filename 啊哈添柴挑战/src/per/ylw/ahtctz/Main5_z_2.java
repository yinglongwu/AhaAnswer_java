package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1041. 有多少个质数
public class Main5_z_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count =0;
		
		for (int i = 1; i <= n; i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}
	
	public static boolean isPrime (int x) {
		if (x==1) {	//1不是质数
			return false;
		}else if (x==2) {
			return true;
		} else {
			for (int i = 2; i < x; i++) {
				if (x%i==0) {//一旦有能整除的，直接返回false
					return false;
				}
			}
			return true;
		}
	}

}
