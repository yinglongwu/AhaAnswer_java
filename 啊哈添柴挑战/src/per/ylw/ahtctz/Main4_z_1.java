package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1031. ì³²¨ÄÇÆõÊýÁÐ
public class Main4_z_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		if (n==1||n==2) {
			System.out.println(1);
		} else {
			int[] a = new int[n];
			a[0] = 1;a[1] = 1;
			for (int i = 2; i < n; i++) {
				a[i] = a[i-1]+a[i-2];
			}
			System.out.println(a[n-1]);
		}
		scanner.close();
	}

}
