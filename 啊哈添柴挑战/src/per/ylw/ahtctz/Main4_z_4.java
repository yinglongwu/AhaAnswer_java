package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1495. ����ͬ��
public class Main4_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		
		for (int i = 0; i <= a; i++) {//��
			for (int j = 0; j<= a; j++) {//��
				if (i*2+j*4==b && i+j==a) {
					System.out.println(i+" "+j);
					break;
				}
			}
		}
		
		scanner.close();
	}

}
