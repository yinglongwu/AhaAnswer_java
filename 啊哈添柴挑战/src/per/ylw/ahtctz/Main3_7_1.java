package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1371. ��3�����Ӵ�С����
public class Main3_7_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		
		//��������������ͨ��forѭ��Ч�ʽϸ�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//Ĭ���������򣬸������㷨��һ���������ŵĿ�������
		Arrays.sort(arr);	//����Ϊ������
		
		//Ϊ���������⵹�����
		for (int i = arr.length-1; i >=0 ; i--) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	}

}
