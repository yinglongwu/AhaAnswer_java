package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1045. 第10001个质数是什么
public class Main5_6_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		int i = 2;//质数从2开始
		
		while (true) {
			if (isPrime(i)) {	//如果是质数
				count++;	//计数器+1
			}
			if (count == n) {	//如果计数器==要求的第n个质数
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
				if (x%i==0) {//一旦有能整除的，直接返回false
					return false;
				}
			}
			return true;
		}
	}
}
