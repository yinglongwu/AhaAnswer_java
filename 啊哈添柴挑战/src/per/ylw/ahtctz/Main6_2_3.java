package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1622. Êı×é²åÈë
public class Main6_2_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int n = scanner.nextInt();
		
		if (n<=arr[0]) {
			System.out.print(n+" ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		} else if(n>arr[0]&&n<arr[arr.length-1]){
			for (int i = 0; i < arr.length-1; i++) {
				if (arr[i]<=n&&n<arr[i+1]) {
					System.out.print(arr[i]+" "+n+" ");
				} else {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println(arr[arr.length-1]);
		} else {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print(n);
		}
		
		scanner.close();
	}

}
