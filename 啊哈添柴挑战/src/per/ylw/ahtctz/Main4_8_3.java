package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1483. ����֮��
public class Main4_8_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h= scanner.nextInt();
		int m= scanner.nextInt();
		int n= scanner.nextInt();
		int count = 2;
		h = h-m;//��ÿ�������»��㵽�ڶ����賿
		
		for (count=2;;count++) {
			h = h+n;
			h = h-m;
			if (h<=0) {
				break;
			}
		}
		
		System.out.println(count);
		scanner.close();
	}

}
