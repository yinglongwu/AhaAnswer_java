package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1086. ����С�����2λ
public class Main2_8_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		//�������뱣����λС��
		String result = String.format("%.2f", a);
		
		System.out.println(result);
		scanner.close();
	}

}
