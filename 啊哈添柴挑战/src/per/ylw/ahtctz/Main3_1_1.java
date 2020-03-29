package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1311. ¹ØÏµÔËËã·û¸´Ï°
public class Main3_1_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		switch (n) {
		case 0:
			System.out.println("!=");
			break;
		case 1:
			System.out.println("==");
			break;
		case 2:
			System.out.println("<");
			break;
		case 3:
			System.out.println("<=");
			break;
		case 4:
			System.out.println(">");
			break;
		case 5:
			System.out.println(">=");
			break;	
		default:
			break;
		}
		scanner.close();
	}

}
