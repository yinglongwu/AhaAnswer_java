package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1653. У����������򵥰棩
public class Main6_5_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		//����Ͱ�����˼�룬�±��0��10������11����
		int[] arr = new int[11];
		
		for (int i = 0; i < 3; i++) {
			int begin = scanner.nextInt();
			int end = scanner.nextInt();
			//�������ݲ�һ��������������ں��������
			int min = begin<end?begin:end;
			int max = end>begin?end:begin;
			
			for (int j =min ; j <=max ; j++) {
				arr[j] = 1;//��1��ǣ���ʾҪ�ڵ�
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==0) {
				count++;//ͳ��û��ǵ���
			}
		}
		System.out.println(count);
	}

}
