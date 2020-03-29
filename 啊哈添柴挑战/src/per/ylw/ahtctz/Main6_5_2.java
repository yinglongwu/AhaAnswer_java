package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1652. 桶排序练习（一个萝卜一个坑）
public class Main6_5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//设置一个桶数组，能存的最大的数是1000
		int[] bucket = new int[1001];
		
		for (int i = 0; i < n; i++) {
			int j = scanner.nextInt();
			bucket[j]++;//下标与输入的数相等的桶的个数+1
		}
		//根据桶每个下标的个数，输出桶的下标
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				System.out.print(i+" ");
			}
		}
		
		scanner.close();
	}

}
