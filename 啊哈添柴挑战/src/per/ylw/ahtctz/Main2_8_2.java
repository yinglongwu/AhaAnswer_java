package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1086. 保留小数点后2位
public class Main2_8_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		//四舍五入保留两位小数
		String result = String.format("%.2f", a);
		
		System.out.println(result);
		scanner.close();
	}

}
