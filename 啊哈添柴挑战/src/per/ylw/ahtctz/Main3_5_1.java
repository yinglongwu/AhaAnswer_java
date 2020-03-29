package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1080. Çë¸æËßÎÒË­Ð¡£¿
public class Main3_5_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		System.out.println(x>=y?y:x);
		
		scanner.close();
	}

}
