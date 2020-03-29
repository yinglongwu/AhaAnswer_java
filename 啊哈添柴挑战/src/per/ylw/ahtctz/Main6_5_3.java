package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1653. 校门外的树（简单版）
public class Main6_5_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		//利用桶排序的思想，下标从0到10，代表11棵树
		int[] arr = new int[11];
		
		for (int i = 0; i < 3; i++) {
			int begin = scanner.nextInt();
			int end = scanner.nextInt();
			//测试数据不一定先输入的数大于后输入的数
			int min = begin<end?begin:end;
			int max = end>begin?end:begin;
			
			for (int j =min ; j <=max ; j++) {
				arr[j] = 1;//用1标记，表示要挖掉
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				count++;//统计没标记的树
			}
		}
		System.out.println(count);
	}

}
