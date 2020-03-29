package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1043. 最大质因子
public class Main5_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		maxPrimeFactor(n);
		scanner.close();
	}

	public static void maxPrimeFactor(int n) {
		for (int i = 2; i <= n; i++) {	//先用最小的质数2进行分解
			if (n%i==0) {
				n = n/i;//更新被除数
				if (n==1) {	//如果原来的n除以i等于1，说明因数是其本身，就是最后一个因数了
					System.out.print(i);
					break;	//结束循环，同时防止打印*
				}
				i--;	//抵消除数自增，使其还为2
			}
		}
	}
}
