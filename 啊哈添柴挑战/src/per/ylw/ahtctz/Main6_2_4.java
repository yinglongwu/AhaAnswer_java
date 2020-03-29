package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1773. Êý×éÁ·Ï°I
public class Main6_2_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			arr[i] = arr[i]-10;
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
