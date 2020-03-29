package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1828. ÄæĞòÊä³ö£¨¼òµ¥£©
public class Main6_1_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}
		scanner.close();
	}

}
