package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1070. ������
public class Main3_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int a = scanner.nextInt();
		
		System.out.println((m/a)*(n/a));
		
		scanner.close();
	}

}
