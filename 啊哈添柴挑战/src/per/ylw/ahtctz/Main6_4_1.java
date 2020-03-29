package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1641. ÌÕÌÕÕªÆ»¹û£¨ÌôÕ½£©
public class Main6_4_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int hand = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (hand+30>=arr[i]) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}

}
