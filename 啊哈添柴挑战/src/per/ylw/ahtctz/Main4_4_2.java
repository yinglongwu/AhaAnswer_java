package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1021. ¼ÆËã½×³Ë
public class Main4_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int sum = 1;
		
		for (int i = 1; i <= x ; i++) {
			sum = sum*i;
		}
		
		System.out.println(sum);
		scanner.close();
	}

}
