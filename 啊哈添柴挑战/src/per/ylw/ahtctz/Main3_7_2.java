package per.ylw.ahtctz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1372. �ĸ�����С�������
public class Main3_7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[4];
		
		//��������������ͨ��forѭ��Ч�ʽϸ�
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		//Ĭ���������򣬸������㷨��һ���������ŵĿ�������
		Arrays.sort(arr);	//����Ϊ������
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		scanner.close();
	}

}
