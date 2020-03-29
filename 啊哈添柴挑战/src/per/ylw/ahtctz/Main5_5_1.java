package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1033. 统计出现次数
public class Main5_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int count1=0,count5=0,count10=0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==1) {
				count1++;
			} else if (arr[i]==5) {
				count5++;
			} else if (arr[i]==10) {
				count10++;
			}
		}
		
		System.out.println(count1);
		System.out.println(count5);
		System.out.println(count10);
		scanner.close();
	}

}
