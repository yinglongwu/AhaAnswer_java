package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1663. 选择排序（高级版）
public class Main6_6_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int mode = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		selectSortUpOrDown(arr, mode);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectSortUpOrDown(int arr[],int mode) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i; // 用来记录基准的索引位置，默认值为i
            for (int j = i + 1; j < arr.length; j++) {
            	if (mode==1) {//升序
            		if (arr[j] < arr[index]) {
            			index = j; // 找到其中最小值的位置
                    }
				} else {//降序
            		if (arr[j] > arr[index]) {
            			index = j; // 找到其中最大值的位置
                    }
				}
            }
            // 交换当前索引 i 和 index的值
            if (i != index) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
	}

}
