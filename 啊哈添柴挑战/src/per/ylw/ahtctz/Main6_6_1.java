package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1662. ѡ��������ͨ�棩
public class Main6_6_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		selectSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void selectSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; // ������¼��Сֵ������λ�ã�Ĭ��ֵΪi
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // �ҵ�������Сֵ��λ��
                }
            }
            // ������ǰ���� i ����Сֵ���� minIndex ������ֵ
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
	}

}
