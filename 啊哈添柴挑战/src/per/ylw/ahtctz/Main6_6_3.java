package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1663. ѡ�����򣨸߼��棩
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
            int index = i; // ������¼��׼������λ�ã�Ĭ��ֵΪi
            for (int j = i + 1; j < arr.length; j++) {
            	if (mode==1) {//����
            		if (arr[j] < arr[index]) {
            			index = j; // �ҵ�������Сֵ��λ��
                    }
				} else {//����
            		if (arr[j] > arr[index]) {
            			index = j; // �ҵ��������ֵ��λ��
                    }
				}
            }
            // ������ǰ���� i �� index��ֵ
            if (i != index) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
	}

}
