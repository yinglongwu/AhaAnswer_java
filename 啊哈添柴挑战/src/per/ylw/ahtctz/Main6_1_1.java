package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1016. �������һ����λ��
public class Main6_1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//intתStringȻ�����String����new StringBuffer
		StringBuffer sBuffer = new StringBuffer(Integer.toString(n));
		System.out.println(sBuffer.reverse());//reverse����ʵ��StringBuffer��ת
		scanner.close();
	}

}
