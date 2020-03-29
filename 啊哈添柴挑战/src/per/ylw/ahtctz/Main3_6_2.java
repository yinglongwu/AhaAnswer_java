package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1081. Õý·½ÐÎ
public class Main3_6_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if ((x>=-1&&x<=1)&&(y>=-1&&y<=1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		scanner.close();
	}

}
