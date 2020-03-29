package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1049. 约数最多
public class Main6_z_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int most = 1;int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (numberOfDivisors(i)>count) {
				count = numberOfDivisors(i);
				most = i;
			}
		}
		
		System.out.println(most);
	}

	//求约数的个数
	public static int numberOfDivisors(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				if (n/i!=i) {
					count = count+2;
				}else {
					count = count+1;
				}
			}
		}
		return count;
	}
}
