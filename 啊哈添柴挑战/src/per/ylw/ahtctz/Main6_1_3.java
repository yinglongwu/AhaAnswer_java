package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1611. ���������ϰ���ѣ�
public class Main6_1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		//intתStringȻ�����String����new StringBuffer
		StringBuffer sBuffer = new StringBuffer(Integer.toString(n));
		//reverse����ʵ��StringBuffer��ת,StringBufferתString��תint��ʵ������ǰ���0
		System.out.println(Integer.parseInt(sBuffer.reverse().toString()));
		scanner.close();
	}

}
