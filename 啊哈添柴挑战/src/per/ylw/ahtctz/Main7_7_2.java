package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1071. ³Ë·¨¿Ú¾÷
public class Main7_7_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d*%d=%d ",j,i,i*j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
