package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1074. ��������
public class Main3_z_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();		
		
		//��ǿת2147483647+2147483647�ᳬint��Χ����
		if ((long)a+(long)b>=10) {
			if (a>b) {
				System.out.println("tree");
			} else {
				System.out.println("tea");
			}
		} else {
			System.out.println("water");
		}
		
		scanner.close();
	}

}
