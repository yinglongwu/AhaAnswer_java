package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1043. ���������
public class Main5_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		maxPrimeFactor(n);
		scanner.close();
	}

	public static void maxPrimeFactor(int n) {
		for (int i = 2; i <= n; i++) {	//������С������2���зֽ�
			if (n%i==0) {
				n = n/i;//���±�����
				if (n==1) {	//���ԭ����n����i����1��˵���������䱾���������һ��������
					System.out.print(i);
					break;	//����ѭ����ͬʱ��ֹ��ӡ*
				}
				i--;	//��������������ʹ�仹Ϊ2
			}
		}
	}
}
