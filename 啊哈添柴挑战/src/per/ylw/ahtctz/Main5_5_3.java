package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1553. �ֽ�������
public class Main5_5_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		System.out.print(n+"=");
		primeFactor(n);
		scanner.close();
	}
	
	public static void primeFactor(int n) {
		for (int i = 2; i <= n; i++) {	//������С������2���зֽ�
			if (n%i==0) {
				System.out.print(i);
				n = n/i;//���±�����
				i--;	//��������������ʹ�仹Ϊ2
				if (n==1) {	//���ԭ����n����i����1��˵���������䱾���������һ��������
					break;	//����ѭ����ͬʱ��ֹ��ӡ*
				}
				System.out.print("*");
			}
		}
	}
	
//	public static void primeFactor(int n) {
//		int k = 2;//������С��2��ʼ�ֽ�
//		while (k <= n) {
//           if (k == n) {
//               System.out.print(k);
//               break;
//           } else if (n % k == 0) {
//               System.out.print(k + "*");
//               n = n / k;	//��ʱ��nֵ��Ϊ��һ�ε�n��֮��ֽ�
//           } else {//���涼������С��2ȥ�ֽ⣬���2�ֽⲻ�ˣ�k++
//               k++;
//           }
//		}
//	}
		
}
