package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1652. Ͱ������ϰ��һ���ܲ�һ���ӣ�
public class Main6_5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//����һ��Ͱ���飬�ܴ����������1000
		int[] bucket = new int[1001];
		
		for (int i = 0; i < n; i++) {
			int j = scanner.nextInt();
			bucket[j]++;//�±������������ȵ�Ͱ�ĸ���+1
		}
		//����Ͱÿ���±�ĸ��������Ͱ���±�
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				System.out.print(i+" ");
			}
		}
		
		scanner.close();
	}

}
