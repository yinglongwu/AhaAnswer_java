package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1826. ˳��������򵥣�
public class Main6_1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
