package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1791. 大小写转换（难）
public class Main7_z_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int n = scanner.nextInt();
		
		switch (n) {
		case 1:
			System.out.println(s.toLowerCase());
			break;
		case 2:
			System.out.println(s.toUpperCase());
			break;
		case 3:
			s = s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
			System.out.println(s);
			break;			
		default:
			break;
		}
	}

}
