package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1651. 一个萝卜一个坑
public class Main6_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			boolean repeat = false;
			for (int j = 0; j < arr.length; j++) {
				if (i==arr[j]) {
					repeat = true;
				}
			}
			if (!repeat) {
				System.out.print(i+" ");
			}
		}
	}

}
