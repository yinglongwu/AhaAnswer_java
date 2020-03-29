package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1642. ÌÕÌÕÕªÆ»¹û£¨ÌôÕ½·¬Íâ£©
public class Main6_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
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
