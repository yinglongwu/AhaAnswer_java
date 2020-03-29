package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1099. ¥ÚΩ¥”Õ£°
public class Main2_z_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = (a*10+b)/35;
		
		System.out.println(n);		
		scanner.close();
	}

}
