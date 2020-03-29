package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1100. 时间问题
public class Main2_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int e = scanner.nextInt();
		int f = scanner.nextInt();
		
		int diff = (d*3600+e*60+f)-(a*3600+b*60+c);
		
		int h = diff/3600;
		int m = (diff-h*3600)/60;
		int s = diff%60;
		
		System.out.println(h+" "+m+" "+s);
		scanner.close();
	}

}
