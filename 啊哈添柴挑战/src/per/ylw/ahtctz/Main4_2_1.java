package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1421. 1打印到100再到1
public class Main4_2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i < n; i++) {
			System.out.print(i+" ");
		}
		
		for (int i = n; i > 0 ; i--) {
			System.out.print(i+" ");
		}
		
		scanner.close();
	}

}
