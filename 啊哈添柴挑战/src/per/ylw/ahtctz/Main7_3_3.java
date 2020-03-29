package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1731. ÅÐ¶Ï×Ö·û
public class Main7_3_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c = scanner.nextLine().charAt(0);
		if (c>='A'&&c<='Z') {
			System.out.println("upper");
		} else if (c>='a'&&c<='z') {
			System.out.println("lower");
		} else if (c>='0'&&c<='9') {
			System.out.println("number");
		}else {
			System.out.println("other");
		}
	}

}
