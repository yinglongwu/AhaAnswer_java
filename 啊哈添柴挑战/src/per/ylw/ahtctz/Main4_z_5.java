package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1496. ����
public class Main4_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int sum=0;
			for (int j = 1; j < i; j++) {//����ö�٣���������
				if (i%j==0) {//�������
					sum = sum+j;//�������
				}
			}
			if (sum == i) {	//������������
				System.out.print(i+" ");//�������
			}
		}
		scanner.close();
	}
}
