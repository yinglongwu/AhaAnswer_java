package per.ylw.ahtctz;

import java.util.Scanner;

/**
 * @author yinglongwu
 */
//1751. ×Ö·ûµÄÅÅÐò£¨¼òµ¥°æ£©
public class Main7_5_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char c1 = scanner.next().charAt(0);
		char c2 = scanner.next().charAt(0);
		System.out.println((c1<c2?c1:c2)+" "+(c1>c2?c1:c2));
	}

}
