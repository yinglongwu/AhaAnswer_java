package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1015. 圆相关的计算
public class Main2_8_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r = scanner.nextDouble();
		double pi = 3.14159;
		
		//注意这里的输出方式
		System.out.printf("%.4f %.4f %.4f", 2*r,2*pi*r,pi*r*r);
		scanner.close();
	}

}
