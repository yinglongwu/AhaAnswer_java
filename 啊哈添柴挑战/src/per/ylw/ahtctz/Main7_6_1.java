package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1761. ×ÖµäÐò£¨¼òµ¥°æ£©
public class Main7_6_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.next();
		String string2 = scanner.next();
		if (string1.compareTo(string2)<0) {
			System.out.println(string1);
			System.out.println(string2);
		} else {
			System.out.println(string2);
			System.out.println(string1);
		}
	}

}
