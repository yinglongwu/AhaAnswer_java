package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1371. 把3个数从大到小排序
public class Main3_7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		
		//对于数组来讲普通的for循环效率较高
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//默认升序排序，该排序算法是一个经过调优的快速排序法
		Arrays.sort(arr);	//参数为数组名
		
		//为了满足题意倒序输出
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	}

}
