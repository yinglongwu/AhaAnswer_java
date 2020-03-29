package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1034. 最高的分数
public class Main4_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		
		System.out.println(a[n-1]);
		scanner.close();
	}

}
