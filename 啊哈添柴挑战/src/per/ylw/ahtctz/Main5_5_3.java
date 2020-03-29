package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1553. 分解质因数
public class Main5_5_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.print(n+"=");
		primeFactor(n);
		scanner.close();
	}
	
	public static void primeFactor(int n) {
		for (int i = 2; i <= n; i++) {	//先用最小的质数2进行分解
			if (n%i==0) {
				System.out.print(i);
				n = n/i;//更新被除数
				i--;	//抵消除数自增，使其还为2
				if (n==1) {	//如果原来的n除以i等于1，说明因数是其本身，就是最后一个因数了
					break;	//结束循环，同时防止打印*
				}
				System.out.print("*");
			}
		}
	}
	
//	public static void primeFactor(int n) {
//		int k = 2;//先用最小的2开始分解
//		while (k <= n) {
//           if (k == n) {
//               System.out.print(k);
//               break;
//           } else if (n % k == 0) {
//               System.out.print(k + "*");
//               n = n / k;	//此时的n值作为下一次的n，之后分解
//           } else {//上面都是用最小的2去分解，如果2分解不了，k++
//               k++;
//           }
//		}
//	}
		
}
