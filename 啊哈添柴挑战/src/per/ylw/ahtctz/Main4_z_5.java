package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1496. 完数
public class Main4_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int sum=0;
			for (int j = 1; j < i; j++) {//因数枚举，不含自身
				if (i%j==0) {//如果整除
					sum = sum+j;//因数相加
				}
			}
			if (sum == i) {	//如果因数和相等
				System.out.print(i+" ");//输出完数
			}
		}
		scanner.close();
	}
}
