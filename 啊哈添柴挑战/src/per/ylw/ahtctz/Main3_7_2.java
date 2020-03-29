package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1372. 四个数从小到大输出
public class Main3_7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		
		//对于数组来讲普通的for循环效率较高
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//默认升序排序，该排序算法是一个经过调优的快速排序法
		Arrays.sort(arr);	//参数为数组名
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	}

}
