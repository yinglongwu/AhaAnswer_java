package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1068. ÎÂ¶È×ª»»
public class Main2_z_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double F  = scanner.nextDouble();
		double C = (F-32)*5/9;
		
		System.out.printf("%.4f",C);
		scanner.close();
	}

}
