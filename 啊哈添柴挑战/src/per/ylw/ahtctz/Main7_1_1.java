package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1009. ×Ö·ûÈý½ÇÐÎ
public class Main7_1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3-i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}
