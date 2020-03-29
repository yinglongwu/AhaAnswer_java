package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1046. 克拉兹问题
public class Main5_z_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;
		
		while (n!=1) {
			if (n%2!=0) {
				n = 3*n+1;
			} else {
				n = n/2;
			}
			count++;
		}
		
		System.out.println(count);
		scanner.close();
	}

}
